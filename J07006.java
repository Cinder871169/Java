import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07006 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> l = (ArrayList<Integer>) in.readObject();
        int[] a = new int[1000];
        for (Integer i : l) {
            a[i]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
            }
        }
        in.close();
    }
}
