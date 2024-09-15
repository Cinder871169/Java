package ThucHanh;

import java.util.*;

public class B2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            ArrayList<Character> a = new ArrayList<>();
            int sum = 0;
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    a.add(c);
                } else {
                    sum += Character.getNumericValue(c);
                }
            }
            Collections.sort(a);
            for (char c : a) {
                System.out.print(c);
            }
            System.out.println(sum);
        }
    }
}
