import java.util.Scanner;

public class J02014 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int a[] = new int[100005];
            int s = 0, x = 0, pos = -1;
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                s += a[i];
            }
            for (int i = 1; i <= n; i++) {
                if (x * 2 + a[i] == s) {
                    pos = i;
                    break;
                }
                x += a[i];
            }
            System.out.println(pos);
        }
    }
}
