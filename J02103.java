import java.util.Scanner;

public class J02103 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    a[i][j] = b[j][i] = sc.nextInt();
            System.out.printf("Test %d:\n", x);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int k = 0;
                    for (int p = 0; p < m; p++)
                        k += a[i][p] * b[p][j];
                    System.out.printf("%d ", k);
                }
                System.out.println();
            }
        }
    }
}
