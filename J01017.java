import java.util.*;

public class J01017 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++)
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
