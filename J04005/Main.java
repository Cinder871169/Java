package J04005;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = sc.nextLine();
        String date = sc.nextLine();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        ThiSinh t = new ThiSinh(name, date, a, b, c);
        System.out.println(t);
    }
}
