package ThucHanh.TH2.Polygon;

public class Polygon {
    private Point[] p;

    public Polygon(Point[] p) {
        this.p = p;
    }

    public String getArea() {
        int n = p.length;
        double area = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += p[i].getX() * p[j].getY() - p[i].getY() * p[j].getX();
        }
        area = Math.abs(area) / 2.0;
        return String.format("%.3f", area);
    }
}