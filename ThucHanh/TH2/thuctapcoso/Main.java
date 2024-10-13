package ThucHanh.TH2.thuctapcoso;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<SinhVien> s = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            s.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<DeTai> m = new ArrayList<>();
        sc = new Scanner(new File("DETAI.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            m.add(new DeTai(sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        ArrayList<NhiemVu> nv = new ArrayList<>();
        sc = new Scanner(new File("NHIEMVU.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String msv = sc.next();
            String subjectID = sc.next();
            NhiemVu x = new NhiemVu(msv, subjectID);
            for (SinhVien i : s) {
                if (i.getId().equals(msv)) {
                    x.setSv(i);
                }
            }
            for (DeTai i : m) {
                if (i.getId().equals(subjectID)) {
                    x.setMh(i);
                }
            }
            nv.add(x);
        }
        sc.close();
        Collections.sort(nv);
        for (NhiemVu i : nv) {
            System.out.println(i);
        }
    }
}
