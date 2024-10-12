package Contest.Polygon;

import java.util.Arrays;

public class Polygon {
    private Point[] p;

    public Polygon(Point[] p) {
        this.p = p;
    }

    public double getArea() {
        double[] sides = new double[p.length];
        for (int i = 0; i < p.length; i++) {
            sides[i] = distance(p[i], p[(i + 1) % p.length]);
        }
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[sides.length - 1]) {
            return 0;
        }

        double s = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }

    private static double distance(Point a, Point b) {
        return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }
}