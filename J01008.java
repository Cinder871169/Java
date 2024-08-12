import java.util.*;
import java.lang.Math;

public class J01008 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", k);
            for (int i = 2; i <= Math.sqrt(n); i++) {
                int s = 0;
                while (n % i == 0) {
                    s++;
                    n /= i;
                }
                if (s > 0)
                    System.out.printf("%d(%d) ", i, s);
            }
            if (n > 1)
                System.out.printf("%d(1)", n);
            System.out.println();
        }
    }
}