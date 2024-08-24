import java.util.Scanner;

public class J02005 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = new int[1005];
        int b[] = new int[1005];
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            b[x] = 1;
        }
        for (int i = 0; i < 1000; i++)
            if (a[i] == 1 && b[i] == 1)
                System.out.printf("%d ", i);
    }
}
