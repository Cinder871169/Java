package ThucHanh.TH2.baitoanbanhang;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KH> customer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            customer.add(new KH(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();

        sc = new Scanner(new File("MH.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> goods = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            goods.add(new MH(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));
        }
        sc.close();

        ArrayList<HD> invoice = new ArrayList<>();
        sc = new Scanner(new File("HD.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String kh = sc.next();
            String mh = sc.next();
            int sl = Integer.parseInt(sc.next());
            HD x = new HD(kh, mh, sl);
            for (KH it : customer) {
                if (it.getMkh().equals(kh)) {
                    x.setK(it);
                }
            }
            for (MH it : goods) {
                if (it.getMmh().equals(mh)) {
                    x.setM(it);
                }
            }
            invoice.add(x);
        }
        sc.close();
        for (HD i : invoice) {
            System.out.println(i);
        }
    }
}
