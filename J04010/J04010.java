package J04010;

import java.util.*;
import java.lang.Math;

public class J04010 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            Point[] p = new Point[3];
            for (int i = 0; i < 3; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                Point o = new Point(x, y);
                p[i] = o;
            }
            double a = p[0].distance(p[1]);
            double b = p[1].distance(p[2]);
            double c = p[0].distance(p[2]);
            if (a + b <= c || a + c <= b || b + c <= a)
                System.out.println("INVALID");
            else {
                double k = (a + b + c) / 2;
                double s = Math.sqrt(k * (k - a) * (k - b) * (k - c));
                double r = a * b * c / (4 * s);
                System.out.printf("%.3f\n", Math.PI * r * r);
            }
        }
    }
}
