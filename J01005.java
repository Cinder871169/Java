import java.util.*;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for (int i = 1; i < n; i++) {
                double k = Math.sqrt(i / n) * h;
                System.out.printf("%.6f ", k);
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
 * S[0] = h[0]/2, b[0] = 1
 * S tung phan = h[0]/(2n)
 * S[n] = b[i]*h[i]/2
 * b[i] = h[i]/h[0] -> S[i] = h[i]*h[i]/(2*h[0])
 * S[i] = i*S[0]/n => h[i] = h[0]*sqrt(i/n)
 */
