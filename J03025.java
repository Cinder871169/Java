import java.util.Scanner;

public class J03025 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int cnt = 0, n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1))
                cnt++;
        }
        if (n % 2 == 0 && cnt == 1 || n % 2 == 1 && cnt <= 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
