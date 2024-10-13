package ThucHanh.TH2.baocaothuctapcoso;

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

        ArrayList<ArrayList<NhiemVu>> hoidong = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            hoidong.add(new ArrayList<>());
        }
        sc = new Scanner(new File("HOIDONG.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String msv = sc.next();
            String detai = sc.next();
            String hdID = sc.next();
            int num = hdID.charAt(2) - '0';
            NhiemVu nv = new NhiemVu(msv, hdID, hdID);
            for (SinhVien i : s) {
                if (i.getId().equals(msv)) {
                    nv.setSv(i);
                }
            }
            for (DeTai i : m) {
                if (i.getId().equals(detai)) {
                    nv.setMh(i);
                }
            }
            hoidong.get(num).add(nv);
        }
        for (int i = 0; i < 9; i++) {
            if (!hoidong.get(i).isEmpty()) {
                Collections.sort(hoidong.get(i));
                System.out.printf("DANH SACH HOI DONG %d:\n", i);
                for (NhiemVu j : hoidong.get(i)) {
                    System.out.println(j);
                }
            }
        }
    }
}
