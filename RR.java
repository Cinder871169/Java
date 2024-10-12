import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RR {

    public static double solve(int[] a, int k) {
        int n = a.length;
        int[] tgConLai = new int[n];
        int[] tgCho = new int[n];
        int thoiGian = 0;

        for (int i = 0; i < n; i++) {
            tgConLai[i] = a[i];
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            q.add(i);

        while (!q.isEmpty()) {
            int i = q.poll();
            if (tgConLai[i] > k) {
                thoiGian += k;
                tgConLai[i] -= k;
                q.add(i);
            } else {
                thoiGian += tgConLai[i];
                tgCho[i] = thoiGian - a[i];
                tgConLai[i] = 0;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += tgCho[i];
        }

        return (double) ans / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thoi gian cho cua P1, P2, P3:");
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        System.out.println("Nhap luong tu thoi gian:");
        int k = sc.nextInt();

        int[] a = { p1, p2, p3 };

        double res = solve(a, k);
        System.out.println("Thoi gian cho trung binh RR: " + res);
        sc.close();
    }
}
