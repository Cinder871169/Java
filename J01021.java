import java.util.Scanner;

public class J01021 {
    static long mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static long pow(long a, long b) {
        if (b == 0)
            return 1;
        long k = pow(a, b / 2);
        k = (k * k) % mod;
        if (b % 2 == 0)
            return k;
        else
            return (k * a) % mod;
    }

    public static void main(String[] args) {
        while (true) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (n == 0 && k == 0)
                return;
            System.out.println(pow(n, k));
        }
    }
}
