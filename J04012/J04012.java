package J04012;

import java.util.Scanner;

public class J04012 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = sc.nextLine();
        int baseSalary = Integer.parseInt(sc.nextLine());
        int day = Integer.parseInt(sc.nextLine());
        String role = sc.nextLine();
        NhanVien a = new NhanVien(name, baseSalary, day, role);
        System.out.println(a);
    }
}
