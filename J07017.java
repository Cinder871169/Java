import java.util.*;
import java.io.*;
import java.lang.Math;

class Pair<T1, T2> {
    private T1 fi;
    private T2 se;

    public Pair(T1 fi, T2 se) {
        this.fi = fi;
        this.se = se;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public boolean isPrime() {
        return isPrime((Integer) fi) && isPrime((Integer) se);
    }

    @Override
    public String toString() {
        return fi + " " + se;
    }
}

public class J07017 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check)
                System.out.println(-1);
        }
        sc.close();
    }
}
