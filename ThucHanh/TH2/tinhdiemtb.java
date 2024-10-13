package ThucHanh.TH2;

import java.util.*;

public class tinhdiemtb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(sc.nextDouble());
        }
        double max = Collections.max(lst);
        double min = Collections.min(lst);
        lst.removeIf(i -> i == max || i == min);
        double sum = 0;
        for (double it : lst) {
            sum += it;
        }
        double res = sum / lst.size();
        System.out.printf("%.2f", res);
        sc.close();
    }
}
