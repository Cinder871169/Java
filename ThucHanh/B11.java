package ThucHanh;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B11 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> se = new HashSet<>();
        Pattern t = Pattern.compile("(?:[01]\\d|2[0-3]):[0-5]\\d:([0-5]\\d)");
        while (sc.hasNextLine()) {
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                Matcher m = t.matcher(s);
                while (m.find()) {
                    se.add(m.group());
                }
            }
            ArrayList<String> timeList = new ArrayList<>(se);
            Collections.sort(timeList);
            for (String it : timeList) {
                System.out.println(it);
            }
        }
    }
}
