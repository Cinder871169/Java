package Contest;

import java.util.*;

public class taphopsonguyen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listA.add(in.nextInt());
        }

        for (int i = 0; i < m; i++) {
            listB.add(in.nextInt());
        }

        Set<Integer> setA = new HashSet<>(listA);
        Set<Integer> setB = new HashSet<>(listB);

        Integer[] arrayA = setA.toArray(new Integer[0]);
        Integer[] arrayB = setB.toArray(new Integer[0]);

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        ArrayList<Integer> intersection = new ArrayList<>();
        for (Integer num : arrayA) {
            if (Arrays.binarySearch(arrayB, num) >= 0) {
                intersection.add(num);
            }
        }

        ArrayList<Integer> diffAminusB = new ArrayList<>();
        for (Integer num : arrayA) {
            if (Arrays.binarySearch(arrayB, num) < 0) {
                diffAminusB.add(num);
            }
        }

        ArrayList<Integer> diffBminusA = new ArrayList<>();
        for (Integer num : arrayB) {
            if (Arrays.binarySearch(arrayA, num) < 0) {
                diffBminusA.add(num);
            }
        }

        System.out.println(formatList(intersection));
        System.out.println(formatList(diffAminusB));
        System.out.println(formatList(diffBminusA));

        in.close();
    }

    private static String formatList(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
