import java.util.*;

public class J03010 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> mp = new HashMap<String, Integer>();

        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> v = new Vector<String>();
            String k = "";
            s = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (!k.isEmpty()) {
                        v.add(k);
                        k = "";
                    }
                } else {
                    k += s.charAt(i);
                }
            }
            if (!k.isEmpty()) {
                v.add(k);
            }

            int x = v.size();
            String res = v.get(x - 1);
            for (int i = 0; i < x - 1; i++) {
                res += v.get(i).substring(0, 1);
            }
            if (mp.get(res) == null) {
                mp.put(res, 1);
                k = "";
            } else {
                int count = mp.get(res);
                count++;
                k = Integer.toString(count);
                mp.put(res, count);
            }
            System.out.println(res + k + "@ptit.edu.vn");
        }
    }
}
