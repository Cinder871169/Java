import java.util.*;

public class J02016 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            boolean found = false;
            for (int k = n - 1; k >= 2; k--) {
                int i = 0;
                int j = k - 1;
                while (i < j) {
                    long sumOfSquares = a[i] * a[i] + a[j] * a[j];
                    long squareOfCurrent = a[k] * a[k];

                    if (sumOfSquares == squareOfCurrent) {
                        found = true;
                        break;
                    } else if (sumOfSquares < squareOfCurrent) {
                        i++;
                    } else {
                        j--;
                    }
                }
                if (found)
                    break;
            }

            if (found)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
