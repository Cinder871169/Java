import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class Pair {
    public int fi;
    public int se;

    void input(Scanner sc) {
        fi = sc.nextInt();
        se = sc.nextInt();
    }
}

public class J02029 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Vector<Pair> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            Pair p = new Pair();
            p.input(sc);
            v.add(p);
        }
        Collections.sort(v, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                return Integer.compare(a.fi, b.fi);
            }
        });
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (res < v.get(i).fi)
                res = v.get(i).fi;
            res += v.get(i).se;
        }
        System.out.println(res);
    }
}
