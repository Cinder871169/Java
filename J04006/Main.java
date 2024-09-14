package J04006;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String ns = sc.nextLine();
        double gpa = sc.nextDouble();
        SinhVien sv = new SinhVien(name, lop, ns, gpa);
        System.out.println(sv);
    }
}
