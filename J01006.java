import java.util.*;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long f[] = new long[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 93; i++)
            f[i] = f[i - 1] + f[i - 2];
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
        sc.close();
    }
}
