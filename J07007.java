import java.io.*;
import java.util.*;

class WordSet {
    private Set<String> se;

    public WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        se = new TreeSet<>();
        while (sc.hasNext()) {
            se.add(sc.next().toLowerCase());
        }
        sc.close();
    }

    @Override
    public String toString() {
        String res = "";
        for (String i : se) {
            res += i + "\n";
        }
        return res;
    }
}

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet a = new WordSet("VANBAN.in");
        System.out.println(a);
    }
}
