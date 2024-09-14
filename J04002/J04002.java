package J04002;

import java.util.*;

public class J04002 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String c = sc.next();
        if (w > 0 && h > 0) {
            Rectangle r = new Rectangle(w, h, c);
            System.out.println(r);
        } else {
            System.out.println("INVALID");
        }
    }
}
