package Contest;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class kiemtrachiahet {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int t = Integer.parseInt(sc.nextLine());
        BigInteger d7 = new BigInteger("7");
        BigInteger d13 = new BigInteger("13");

        while (t-- > 0) {
            BigInteger x = new BigInteger(sc.next());
            if (x.mod(d7).toString().equals("0") && x.mod(d13).toString().equals("0")) {
                System.out.println("Both");
            } else if (x.mod(d7).toString().equals("0")) {
                System.out.println("Div 7");
            } else if (x.mod(d13).toString().equals("0")) {
                System.out.println("Div 13");
            } else {
                System.out.println("None");
            }
        }
        sc.close();
    }
}
