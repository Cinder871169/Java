import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.compareTo(b) < 0) {
                BigInteger c = a;
                a = b;
                b = c;
            }
            BigInteger res = a.subtract(b);
            if (res.toString().length() < a.toString().length())
                System.out.print(0);
            System.out.println(res);
        }
    }
}
