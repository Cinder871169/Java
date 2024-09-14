import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.subtract(b));
    }
}
