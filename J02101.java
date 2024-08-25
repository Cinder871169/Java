import java.util.Scanner;

public class J02101 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int l = 0, r = n, k = 1;
                if (i % 2 == 1) {
                    l = n - 1;
                    r = -1;
                    k = -1;
                }
                for (int j = l; j != r; j += k)
                    System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
