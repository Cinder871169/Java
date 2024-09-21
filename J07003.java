import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        if (s.length() == 1) {
            System.out.println(s);
            sc.close();
            return;
        }
        while (s.length() > 1) {
            BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
            BigInteger b = new BigInteger(s.substring(s.length() / 2));
            s = a.add(b).toString();
            System.out.println(s);
        }
        sc.close();
    }
}
