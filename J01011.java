import java.util.Scanner;

public class J01011 {

    public static Scanner sc = new Scanner(System.in);

    public static long gcd(long a, long b) {
        while (a != 0) {
            long x = a;
            a = b % a;
            b = x;
        }
        return b;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = gcd(a, b);
            System.out.println(a * b / c + " " + c);
        }
    }
}
