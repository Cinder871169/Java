import java.util.*;

public class J01007 {

    public static long[] f = new long[100];
    public static Scanner sc = new Scanner(System.in);

    public static void init() {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 93; i++)
            f[i] = f[i - 1] + f[i - 2];
    }

    public static boolean fibo(long n) {
        for (long i : f) {
            if (i == n)
                return true;
            else if (i > n)
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        init();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (fibo(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
