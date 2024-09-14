package J04015;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String id = sc.nextLine();
        String ten = sc.nextLine();
        int baseSalary = sc.nextInt();
        GiaoVien a = new GiaoVien(id, ten, baseSalary);
        System.out.println(a);
    }
}
