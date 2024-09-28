import java.util.*;
import java.io.*;

public class J07021 {

    public static String chuanHoa(String s) {
        String[] a = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String i : a) {
            res.append(i.substring(0, 1).toUpperCase()).append(i.substring(1).toLowerCase()).append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine();
            if (s.equals("END")) {
                break;
            }
            System.out.println(chuanHoa(s));
        }
        sc.close();
    }
}
