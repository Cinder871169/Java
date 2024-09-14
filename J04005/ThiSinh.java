package J04005;

public class ThiSinh {
    private String name, date;
    double p1, p2, p3, total;

    ThiSinh(String name, String date, double p1, double p2, double p3) {
        this.name = name;
        this.date = date;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.total = p1 + p2 + p3;
    }

    @Override
    public String toString() {
        return name + " " + date + " " + String.format("%.1f", total);
    }
}
