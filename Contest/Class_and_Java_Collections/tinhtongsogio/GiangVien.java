package Contest.Class_and_Java_Collections.tinhtongsogio;

public class GiangVien {
    private String id, name;
    private double hours;

    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHours() {
        return hours;
    }

    public void addHours(double x) {
        this.hours += x;
    }
}
