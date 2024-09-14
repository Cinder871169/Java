package J04015;

public class GiaoVien {
    private String id, ten;
    private int role, bonus, baseSalary;

    public GiaoVien() {

    }

    public GiaoVien(String id, String ten, int baseSalary) {
        this.id = id;
        this.ten = ten;
        this.baseSalary = baseSalary;

        role = Integer.parseInt(id.substring(2));
        if (id.substring(0, 2).equals("HT")) {
            bonus = 2000000;
        }
        if (id.substring(0, 2).equals("HP")) {
            bonus = 900000;
        }
        if (id.substring(0, 2).equals("GV")) {
            bonus = 500000;
        }
    }

    public int getSalary() {
        return baseSalary * role + bonus;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + role + " " + bonus + " " + getSalary();
    }
}
