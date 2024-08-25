import java.util.Scanner;
import java.lang.StringBuilder;

public class J03006 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        StringBuilder x = new StringBuilder(s).reverse();
        if (!x.toString().equals(s))
            return false;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 1)
                return false;
        }
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
