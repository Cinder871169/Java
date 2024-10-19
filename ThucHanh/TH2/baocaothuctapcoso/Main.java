package ThucHanh.TH2.baocaothuctapcoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<SinhVien> sinhVienList = readSinhVienData("SINHVIEN.in");
            ArrayList<DeTai> deTaiList = readDeTaiData("DETAI.in");
            ArrayList<ArrayList<NhiemVu>> hoiDongList = readHoidongData("HOIDONG.in", sinhVienList, deTaiList);

            printHoidong(hoiDongList);
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
            e.printStackTrace();
        }
    }

    private static ArrayList<SinhVien> readSinhVienData(String fileName) throws FileNotFoundException {
        ArrayList<SinhVien> sinhVienList = new ArrayList<>();
        Scanner sc = new Scanner(new File(fileName));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            sinhVienList.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        return sinhVienList;
    }

    private static ArrayList<DeTai> readDeTaiData(String fileName) throws FileNotFoundException {
        ArrayList<DeTai> deTaiList = new ArrayList<>();
        Scanner sc = new Scanner(new File(fileName));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            deTaiList.add(new DeTai(sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        return deTaiList;
    }

    private static ArrayList<ArrayList<NhiemVu>> readHoidongData(String fileName, ArrayList<SinhVien> sinhVienList,
            ArrayList<DeTai> deTaiList) throws FileNotFoundException {
        ArrayList<ArrayList<NhiemVu>> hoiDongList = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            hoiDongList.add(new ArrayList<>());
        }

        Scanner sc = new Scanner(new File(fileName));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String msv = sc.next();
            String detai = sc.next();
            String hdID = sc.next();
            int num = hdID.charAt(2) - '0';
            NhiemVu nv = new NhiemVu(msv, detai, hdID);
            assignSinhVienAndDeTai(nv, sinhVienList, deTaiList);
            hoiDongList.get(num).add(nv);
        }
        sc.close();
        return hoiDongList;
    }

    private static void assignSinhVienAndDeTai(NhiemVu nv, ArrayList<SinhVien> sinhVienList,
            ArrayList<DeTai> deTaiList) {
        for (SinhVien sv : sinhVienList) {
            if (sv.getId().equals(nv.getMsv())) {
                nv.setSv(sv);
            }
        }
        for (DeTai dt : deTaiList) {
            if (dt.getId().equals(nv.getSubjectID())) {
                nv.setMh(dt);
            }
        }
    }

    private static void printHoidong(ArrayList<ArrayList<NhiemVu>> hoiDongList) {
        for (int i = 0; i < 9; i++) {
            if (!hoiDongList.get(i).isEmpty()) {
                Collections.sort(hoiDongList.get(i));
                System.out.printf("DANH SACH HOI DONG %d:\n", i);
                for (NhiemVu j : hoiDongList.get(i)) {
                    System.out.println(j);
                }
            }
        }
    }
}
