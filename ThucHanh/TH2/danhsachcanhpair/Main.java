package ThucHanh.TH2.danhsachcanhpair;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pair<Integer, Integer> p;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (i < j && a == 1) {
                    p = new Pair<>(i + 1, j + 1);
                    System.out.println(p);
                }
            }
        }
    }
}
