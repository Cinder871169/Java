package J04008;

import java.util.Scanner;

public class Main {
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
                System.out.printf("%.3f\n", d1 + d2 + d3);
            }
        }
    }
}
