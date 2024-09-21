package Contest;

import java.util.*;
import java.io.*;

public class loaibosonguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.valueOf(s);
            } catch (NumberFormatException e) {
                list.add(s);
            }
        }
        Collections.sort(list);
        for (String i : list) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
