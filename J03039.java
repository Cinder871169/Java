import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.mod(b) == BigInteger.ZERO || b.mod(a) == BigInteger.ZERO)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
