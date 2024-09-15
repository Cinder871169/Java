package ThucHanh;

import java.util.Scanner;

public class B4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            long a = 1, b = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0 && s.charAt(i) != '0')
                    a *= (s.charAt(i) - '0');
                else
                    b += s.charAt(i) - '0';
            }
            System.out.println(a + " " + b);
        }
    }
}
