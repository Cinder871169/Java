import java.util.Scanner;

public class J02034 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int flag = 0, k, MAX = 0, a[] = new int[201];
        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            if (MAX < k)
                MAX = k;
            a[k]++;
        }
        for (int i = 1; i <= MAX; i++) {
            if (a[i] == 0) {
                flag = 1;
                System.out.println(i);
            }
        }
        if (flag == 0)
            System.out.println("Excellent!");
    }
}
