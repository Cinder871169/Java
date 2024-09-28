import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class SinhVien {
    private static int NUM = 1;
    private String id, ten, lop, ns;
    private double gpa;

    public SinhVien(String ten, String lop, String ns, double gpa) throws ParseException {
        this.id = String.format("B20DCCN%03d", NUM++);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.ns = formatter.format(formatter.parse(ns));
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + ns + String.format(" %.2f", gpa);
    }
}

public class J07010 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien a = new SinhVien(ten, lop, ns, gpa);
            System.out.println(a);
        }
        sc.close();
    }
}
