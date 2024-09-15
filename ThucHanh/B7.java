package ThucHanh;

import java.util.*;

public class B7 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        String s = a[0];
        int m = s.length();
        boolean ok = true;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            int d = 0;
            for (int j = 0; j < n; j++) {
                String x = a[j];
                int k;
                for (k = 0; k < m; k++) {
                    if (x.equals(s)) {
                        d += k;
                        break;
                    }
                    x = x.substring(1) + x.charAt(0);
                }
                if (k == m) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                ans = Math.min(ans, d);
            }
            s = s.substring(1) + s.charAt(0);
        }
        if (ok) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}
