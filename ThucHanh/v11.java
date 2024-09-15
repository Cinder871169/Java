package ThucHanh;

import java.util.*;

public class v11 {
    public static boolean check(String x) {
        if (x.length() != 8)
            return false;
        if (x.charAt(2) != ':' || x.charAt(5) != ':')
            return false;
        for (int i = 0; i < 8; i++) {
            if (i != 2 && i != 5 && !Character.isDigit(x.charAt(i)))
                return false;
        }
        int h = Integer.parseInt(x.substring(0, 2));
        int m = Integer.parseInt(x.substring(3, 5));
        int s = Integer.parseInt(x.substring(6, 8));
        return h < 24 && m < 60 && s < 60;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> se = new TreeSet<String>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] x = s.split("\\s|\\.|\\,");
            for (String it : x) {
                if (check(it))
                    se.add(it);
            }
        }
        for (String i : se)
            System.out.println(i);
    }
}
