import java.util.*;

public class J08011 {
    public static boolean check(String number) {
        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) > number.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        while (scanner.hasNextLine()) {
            input.append(scanner.nextLine()).append(" ");
        }

        String[] numbers = input.toString().trim().split("\\s+");

        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String number : numbers) {
            if (check(number)) {
                countMap.put(number, countMap.getOrDefault(number, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> resultList = new ArrayList<>(countMap.entrySet());

        resultList.sort((a, b) -> {
            if (!b.getValue().equals(a.getValue())) {
                return b.getValue() - a.getValue();
            }
            return 0;
        });

        for (Map.Entry<String, Integer> entry : resultList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        scanner.close();
    }
}
