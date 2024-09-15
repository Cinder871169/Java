package ThucHanh;

import java.util.Scanner;

class SinhVien implements Comparable<SinhVien> {
    private String msv, name, lop, mail, sdt;

    public SinhVien(String msv, String name, String lop, String mail, String sdt) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }

    public String getMsv() {
        return msv;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.lop.compareTo(o.getLop()) != 0)
            return this.lop.compareTo(o.getLop());
        return this.msv.compareTo(o.getMsv());
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + mail + " " + sdt;
    }
}

public class B13 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNextLine()) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            String sdt = sc.nextLine();
            SinhVien a = new SinhVien(msv, name, lop, mail, sdt);
            System.out.println(a);
        }
    }
}
