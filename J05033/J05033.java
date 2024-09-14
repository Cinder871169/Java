package J05033;

import java.util.*;

public class J05033 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Time> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            Time x = new Time(h, m, s);
            a.add(x);
        }
        Collections.sort(a);
        for (Time it : a) {
            System.out.println(it);
        }
    }
}
