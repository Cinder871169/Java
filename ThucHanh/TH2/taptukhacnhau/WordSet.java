package ThucHanh.TH2.taptukhacnhau;

import java.util.*;

public class WordSet {
    private TreeSet<String> se;

    public WordSet(String s) {
        String[] a = s.toLowerCase().split("\\s+");
        se = new TreeSet<>(Arrays.asList(a));
    }

    private TreeSet<String> getSet() {
        return se;
    }

    public String union(WordSet other) {
        TreeSet<String> uSet = (TreeSet<String>) se.clone();
        uSet.addAll(other.getSet());
        return String.join(" ", uSet);
    }

    public String intersection(WordSet other) {
        TreeSet<String> iSet = (TreeSet<String>) se.clone();
        iSet.retainAll(other.getSet());
        return String.join(" ", iSet);
    }
}
