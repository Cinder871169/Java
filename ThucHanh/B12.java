package ThucHanh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class TheLoai {
    private static int ID = 0;
    String ma, name;

    public TheLoai() {
        this.ma = String.format("TL%03d", ID++);
    }
}

class Phim implements Comparable<Phim> {
    int eps;
    String ma, name, date, kind;
    static int ID = 0;

    public Phim() {
        this.ma = String.format("P%03d", ID++);
    }

    public String toString() {
        return ma + " " + kind + " " + date + " Phim so " + ma.substring(3) + " " + eps + "\n";
    }

    @Override
    public int compareTo(Phim other) {
        int[] check = { 6, 7, 8, 9, 3, 4, 1, 2 };
        for (int i = 0; i < 8; i++) {
            if (this.date.charAt(check[i]) < other.date.charAt(check[i]))
                return -1;
            if (this.date.charAt(check[i]) > other.date.charAt(check[i]))
                return 1;
        }
        if (this.name.compareTo(other.name) < 0)
            return -1;
        if (this.name.compareTo(other.name) > 0)
            return 1;
        return Integer.compare(other.eps, this.eps);
    }
}

public class B12 {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok;
        tok = new StringTokenizer(sc.readLine());
        int n = Integer.parseInt(tok.nextToken());
        int m = Integer.parseInt(tok.nextToken());
        TheLoai[] tl = new TheLoai[n];
        Phim[] p = new Phim[m];
        for (int i = 0; i < n; i++) {
            tl[i] = new TheLoai();
            tl[i].name = sc.readLine();
        }
        for (int i = 0; i < m; i++) {
            p[i] = new Phim();
            p[i].kind = sc.readLine();
            p[i].date = sc.readLine();
            p[i].name = sc.readLine();
            p[i].eps = Integer.parseInt(sc.readLine());
        }
        Map<String, String> kindMap = new HashMap<>();
        for (TheLoai i : tl) {
            kindMap.put(i.ma, i.name);
        }
        for (Phim i : p) {
            i.kind = kindMap.get(i.kind);
        }
        Arrays.sort(p);
        for (Phim i : p) {
            {
                System.out.println(i);
            }
        }
    }
}
