package J04012;

public class NhanVien {
    private static int NUM = 1;
    private String id, name, role;
    private int baseSalary, day, bonus, salary, plus;

    public NhanVien(String name, int baseSalary, int day, String role) {
        this.id = String.format("NV%02d", NUM++);
        this.name = name;
        this.baseSalary = baseSalary;
        this.day = day;
        this.role = role;
        this.salary = baseSalary * day;
        if (day >= 25) {
            this.plus = (int) (salary * 0.2f);
        } else if (day >= 22) {
            this.plus = (int) (salary * 0.1f);
        } else
            this.plus = 0;
        switch (role) {
            case "GD":
                bonus = 250000;
                break;
            case "PGD":
                bonus = 200000;
                break;
            case "TP":
                bonus = 180000;
                break;
            case "NV":
                bonus = 150000;
                break;
        }
    }

    public int getSalary() {
        return salary + bonus + plus;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary + " " + plus + " " + bonus + " " + getSalary();
    }
}
