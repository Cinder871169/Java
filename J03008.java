import java.util.Scanner;
import java.lang.StringBuilder;

public class J03008 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++)
            if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7')
                return false;
        StringBuilder x = new StringBuilder(s).reverse();
        if (!x.toString().equals(s))
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
