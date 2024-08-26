import java.util.Scanner;
import java.lang.Character;

public class J03024 {
    public static Scanner sc = new Scanner(System.in);

    public static int check(String s) {
        int n = s.length(), cnt1 = 0, cnt2 = 0;
        if (s.charAt(0) == '0')
            return 0;
        for (int i = 0; i < n; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return 0;
            }
            if ((s.charAt(i) - '0') % 2 == 0)
                cnt1++;
            else
                cnt2++;
        }
        if (n % 2 == 0 && cnt1 > cnt2 || n % 2 == 1 && cnt1 < cnt2)
            return 2;
        return 1;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s) == 2)
                System.out.println("YES");
            else if (check(s) == 1)
                System.out.println("NO");
            else
                System.out.println("INVALID");
        }
    }
}
