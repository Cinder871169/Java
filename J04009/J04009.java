package J04009;

import java.util.Scanner;
import java.lang.Math;

public class J04009 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            Point[] a = new Point[3];
            for (int i = 0; i < 3; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                a[i] = new Point(x, y);
            }

            double d1 = a[0].distance(a[1]);
            double d2 = a[1].distance(a[2]);
            double d3 = a[0].distance(a[2]);

            if (d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) {
                System.out.println("INVALID");
            } else {
                double s = (d1 + d2 + d3) / 2;
                double area = Math.sqrt(s * (s - d1) * (s - d2) * (s - d3));
                System.out.printf("%.2f\n", area);
            }
        }
    }
}
