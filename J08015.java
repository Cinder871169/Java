import java.util.*;

public class J08015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            Map<Long, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }
            long res = 0L;
            for (Long i : a) {
                Long x = k - i;
                if (mp.containsKey(x)) {
                    if (i.equals(x)) {
                        res += mp.get(x) - 1;
                    } else {
                        res += mp.get(x);
                    }
                }
            }
            System.out.println(res / 2);
        }
        sc.close();
    }
}
