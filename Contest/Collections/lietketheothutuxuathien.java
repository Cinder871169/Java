package Contest.Collections;

import java.io.*;
import java.util.*;

public class lietketheothutuxuathien {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list = (ArrayList<String>) in.readObject();
        Set<String> se = new TreeSet<>();
        for (String i : list) {
            String[] words = i.trim().toLowerCase().split("\\s+");
            se.addAll(Arrays.asList(words));
        }

        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if (se.contains(s)) {
                System.out.println(s);
                se.remove(s);
            }
        }
        in.close();
        sc.close();
    }
}
