package Contest.Class_and_Java_Collections.dongphuc;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<SinhVien> sv = new ArrayList<>();
        ArrayList<Dangky> reg = new ArrayList<>();
        Map<String, String> mp = new HashMap<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String email = sc.nextLine();
            String phone = sc.nextLine();
            String gt = sc.nextLine();
            sv.add(new SinhVien(id, name, className, email, phone, gt));
        }
        sc.close();

        sc = new Scanner(new File("DANGKY.in"));
        while (sc.hasNextLine()) {
            String[] s = sc.nextLine().split(" ");
            reg.add(new Dangky(s[0], s[1]));
            mp.put(s[0], s[1]);
        }
        sc.close();

        sc = new Scanner(new File("TRUYVAN.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] q = sc.nextLine().split(" ");
            String gt = q[0];
            String size = q[1];
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s\n", gt.toUpperCase(), size);
            ArrayList<SinhVien> res = new ArrayList<>();
            for (SinhVien i : sv) {
                if (i.getGt().equalsIgnoreCase(gt.toUpperCase()) && mp.containsKey(i.getId())
                        && mp.get(i.getId()).equalsIgnoreCase(size)) {
                    res.add(i);
                }
            }

            Collections.sort(res, (s1, s2) -> s1.getId().compareTo(s2.getId()));
            for (SinhVien it : res) {
                System.out.println(it);
            }
        }
        sc.close();
    }
}
