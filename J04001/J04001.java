package J04001;

import java.util.Scanner;

public class J04001 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point a = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point(x, y);
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
