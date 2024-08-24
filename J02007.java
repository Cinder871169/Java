import java.util.Scanner;

public class J02007 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int a[] = new int[105];
            int b[] = new int[10005];
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[a[i]]++;
            }
            System.out.printf("Test %d:\n", k);
            for (int i = 0; i < n; i++)
                if (b[a[i]] != 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], b[a[i]]);
                    b[a[i]] = 0;
                }
        }
    }
}
