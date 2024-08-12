import java.util.Scanner;

public class J01010 {

    public static Scanner sc = new Scanner(System.in);

    public static long solve(String s) {
        long res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1')
                res = res * 10 + 1;
            else if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9')
                res = res * 10;
            else
                return -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            long res = solve(s);
            if (res == -1 || res == 0)
                System.out.println("INVALID");
            else
                System.out.println(res);
        }
    }
}
