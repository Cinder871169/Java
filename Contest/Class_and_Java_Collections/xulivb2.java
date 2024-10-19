package Contest.Class_and_Java_Collections;

import java.util.*;
import java.io.*;

public class xulivb2 {
    public static boolean check1(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean check2(String s) {
        char[] p = { '.', ',', '!', '?', ':' };
        for (char c : s.toCharArray()) {
            for (char i : p) {
                if (c == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Set<String> se = new TreeSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for (String i : a) {
                if (check1(i) && !check2(i)) {
                    se.add(i);
                }
            }
        }
        for (String i : se) {
            System.out.println(i);
        }
        sc.close();
    }
}
