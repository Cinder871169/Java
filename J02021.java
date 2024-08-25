import java.util.Scanner;

public class J02021 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        int a[] = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
        while (true) {
            cnt++;
            int flag = 0;
            for (int i = 1; i <= k; i++) {
                System.out.printf("%d", a[i]);
            }
            System.out.print(" ");
            for (int i = k; i >= 1; i--) {
                if (a[i] != n - k + i) {
                    flag = 1;
                    a[i]++;
                    for (int j = i + 1; j <= k; j++) {
                        a[j] = a[j - 1] + 1;
                    }
                    break;
                }
            }
            if (flag == 0)
                break;
        }
        System.out.printf("\nTong cong co %d to hop", cnt);
    }
}
