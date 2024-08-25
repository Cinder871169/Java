import java.util.Scanner;
import java.lang.StringBuilder;

public class J03007 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int n = s.length();
        if (s.charAt(0) != '8' || s.charAt(n - 1) != '8')
            return false;
        StringBuilder x = new StringBuilder(s).reverse();
        if (!x.toString().equals(s))
            return false;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (s.charAt(i) - '0');
        }
        if (sum % 10 != 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
