import java.util.Scanner;

public class J01022 {
    static long a[] = new long[100];
    public static Scanner sc = new Scanner(System.in);

    public static void init() {
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i < 93; i++)
            a[i] = a[i - 1] + a[i - 2];
    }

    public static int Try(int n, long k) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (k > a[n - 2])
            return Try(n - 1, k - a[n - 2]);
        else
            return Try(n - 2, k);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        init();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n, k));
        }
    }
}
