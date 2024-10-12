package Contest.Collections;

import java.util.*;

public class tangdangiamdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Set<Integer> se1 = new TreeSet<>();
            Set<Integer> se2 = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    se1.add(x);
                } else {
                    se2.add(x);
                }
            }
            for (Integer i : se1) {
                System.out.print(i + " ");
            }
            System.out.println();
            ArrayList<Integer> lst = new ArrayList<>(se2);
            Collections.reverse(lst);
            for (Integer i : lst) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
