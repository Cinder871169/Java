package ThucHanh;

import java.util.*;

public class B5 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.split(" ");
            for (int i = a.length - 1; i >= 0; i--)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}
