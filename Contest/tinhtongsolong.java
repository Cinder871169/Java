package Contest;

import java.util.*;
import java.io.*;

public class tinhtongsolong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            String s = sc.next();
            long res = 0;
            try {
                Integer.valueOf(s);
            } catch (Exception e) {
                long x = Long.parseLong(s);
                res += x;
            }
        }
    }
}
