import java.util.Scanner;

public class J01014 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long s = 0;
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    s = i;
                    while (n % i == 0)
                        n /= i;
                }
            }
            if (n > 1)
                s = n;
            System.out.println(s);
        }
    }
}
