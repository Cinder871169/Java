import java.util.Scanner;

public class FCFS {

    public static double solve(int[] a) {
        int n = a.length;
        int[] tgCho = new int[n];
        tgCho[0] = 0;

        for (int i = 1; i < n; i++) {
            tgCho[i] = tgCho[i - 1] + a[i - 1];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += tgCho[i];
        }

        return (double) ans / n;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhap thoi gian cho cua P1, P2, P3:");
        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int p3 = scanner.nextInt();

        int[] a = { p1, p2, p3 };

        double res = solve(a);
        System.out.println("Thoi gian cho trung binh FCFS: " + res);
    }
}
