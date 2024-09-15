package ThucHanh;

import java.util.Scanner;

public class B3 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean prime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 0;
            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (prime(n / i)) {
                        ans = n / i;
                        break;
                    }
                    if (prime(i)) {
                        ans = i;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
