import java.util.Scanner;

public class J01024 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++)
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2')
                return false;
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
