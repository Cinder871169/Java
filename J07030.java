import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;

public class J07030 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    @SuppressWarnings({ "unchecked", "resource" })
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) in.readObject();
        Set<Integer> se1 = new TreeSet<>();
        for (int i : a1) {
            if (prime(i)) {
                se1.add(i);
            }
        }

        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) in.readObject();
        Set<Integer> se2 = new TreeSet<>();
        for (int i : a2) {
            if (prime(i)) {
                se2.add(i);
            }
        }

        for (Integer i : se1) {
            if (i >= 1000000 - i) {
                break;
            }
            if (se2.contains(1000000 - i)) {
                System.out.println(i + " " + (1000000 - i));
            }
        }
    }
}
