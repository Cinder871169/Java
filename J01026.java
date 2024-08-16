import java.util.Scanner;
import java.lang.Math;

public class J01026 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            double x = (int) Math.sqrt(n);
            if (x * x == n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
