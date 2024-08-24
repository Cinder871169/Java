import java.util.Scanner;

public class J02006 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x;
        int a[] = new int[1005];
        for (int i = 0; i < n + m; i++) {
            x = sc.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < 1000; i++)
            if (a[i] == 1)
                System.out.printf("%d ", i);
    }
}
