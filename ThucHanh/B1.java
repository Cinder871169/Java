package ThucHanh;

import java.util.*;

public class B1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String res = "";
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            for (String it : words) {
                if (it.length() > res.length())
                    res = it;
            }
        }
        System.out.println(res + " - " + res.length());
    }
}
