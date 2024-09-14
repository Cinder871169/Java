package J05081;

import java.util.*;

public class J05081 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<MatHang> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a.add(new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));

        }
        Collections.sort(a);
        for (MatHang i : a) {
            System.out.println(i);
        }
    }
}
