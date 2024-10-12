package Contest;

import java.util.*;
import java.io.*;

public class SXmatran {

    public static void sapXepCot(Matrix m, int k) {
        int n = m.getHang();
        int[] col = new int[n];
        for (int i = 0; i < n; i++) {
            col[i] = m.getMatrix()[i][k];
        }
        Arrays.sort(col);
        for (int i = 0; i < n; i++) {
            m.getMatrix()[i][k] = col[i];
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt() - 1;
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            Matrix x = new Matrix(a, n, m);
            sapXepCot(x, k);
            System.out.println(x);
        }
    }
}
