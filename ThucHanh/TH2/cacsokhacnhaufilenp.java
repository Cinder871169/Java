package ThucHanh.TH2;

import java.util.*;
import java.io.*;

public class cacsokhacnhaufilenp {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
            List<String> lst = (ArrayList<String>) ois.readObject();
            ois.close();
            Set<Integer> se = new TreeSet<>();
            for (String i : lst) {
                String[] tok = i.split("\\s+");
                for (String j : tok) {
                    try {
                        int num = Integer.parseInt(j);
                        se.add(num);
                    } catch (NumberFormatException e) {

                    }
                }
            }
            for (int num : se) {
                System.out.println(num);
            }
        } catch (FileNotFoundException FNF) {
            System.out.println("1");
        } catch (IOException IOE) {
            System.out.println("2");
        } catch (ClassNotFoundException CNF) {
            System.out.println("3");
        }
    }
}
