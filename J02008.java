import java.util.*;
import java.math.BigInteger;

public class J02008 {
    public static long bcnn(long a, long b) {
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        BigInteger res = x.gcd(y);
        return res.longValue();
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 1;
            for (long i = 1; i <= n; i++) {
                ans = ans * i / bcnn(ans, i);
            }
            System.out.println(ans);
        }
    }

}
