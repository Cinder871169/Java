package ThucHanh;

import java.util.Scanner;

public class B6 {

    public static Scanner sc = new Scanner(System.in);

    public static String chuanHoa(String s, int n) {
        String[] a = s.toLowerCase().split("\\s+");
        String res = "";
        int l = a.length;
        for (int i = 0; i < l; i++) {
            a[i] = a[i].substring(0, 1).toUpperCase() + a[i].substring(1);
        }
        if (n == 1) {
            res += a[l - 1] + " ";
            for (int i = 0; i < l - 1; i++)
                res += a[i] + " ";
        } else if (n == 2) {
            for (int i = 1; i < l; i++)
                res += a[i] + " ";
            res += a[0];
        }
        return res;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(chuanHoa(s, n));
        }
    }
}