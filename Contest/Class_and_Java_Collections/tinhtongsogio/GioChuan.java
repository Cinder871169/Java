package Contest.Class_and_Java_Collections.tinhtongsogio;

import java.io.*;
import java.util.*;

public class GioChuan {
    private Map<String, GiangVien> mp;

    public GioChuan() {
        mp = new LinkedHashMap<>();
    }

    public void docGV(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] GV = sc.nextLine().split(" ", 2);
            String id = GV[0];
            String name = GV[1];
            mp.put(id, new GiangVien(id, name));
        }
        sc.close();
    }

    public void docGioChuan(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] h = sc.nextLine().split(" ");
            String id = h[0];
            String maMon = h[1];
            double gio = Double.parseDouble(h[2]);
            if (mp.containsKey(id)) {
                mp.get(id).addHours(gio);
            }
        }
        sc.close();
    }

    public void print() {
        for (GiangVien i : mp.values()) {
            System.out.printf("%s %.2f%n", i.getName(), i.getHours());
        }
    }
}
