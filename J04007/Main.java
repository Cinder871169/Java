package J04007;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String ns = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String contract = sc.nextLine();
        NhanVien a = new NhanVien(name, sex, ns, address, tax, contract);
        System.out.println(a);
    }
}
