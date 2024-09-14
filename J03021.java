import java.util.Scanner;

public class J03021 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        int a[] = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9 };
        while (t-- > 0) {
            String s = sc.next().toLowerCase();
            String s1 = "", s2 = "";
            for (int i = 0; i < s.length(); i++) {
                String x = Integer.toString(a[s.charAt(i) - 'a']);
                s1 = s1 + x;
                s2 = x + s2;
            }
            if (s1.compareTo(s2) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
