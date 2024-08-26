import java.util.Scanner;
import java.lang.StringBuilder;

public class J03032 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a[] = sc.nextLine().split(" ");
            for (int i = 0; i < a.length; i++) {
                a[i] = new StringBuilder(a[i]).reverse().toString();
            }
            for (String i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
