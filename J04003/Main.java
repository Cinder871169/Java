package J04003;

import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo p = new PhanSo(a, b);
        System.out.println(p);
    }
}
