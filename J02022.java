import java.util.Scanner;
import java.lang.Math;

public class J02022 {
    public static Scanner sc = new Scanner(System.in);

    static int n, check[] = new int[10];

    public static void Try(String s) {
        int x = s.length();
        if (x == n)
            System.out.println(s);
        for (int i = 1; i <= n; i++) {
            if (x == 0 || check[i] == 0 && Math.abs(s.charAt(x - 1) - '0' - i) != 1) {
                check[i] = 1;
                Try(s + Integer.toString(i));
                check[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            Try("");
        }
    }
}
