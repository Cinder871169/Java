import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07032 {

    public static boolean check(String s) {
        if (s.length() == 1 || s.length() % 2 == 0) {
            return false;
        }
        for (int i = 0; i <= s.length() / 2; i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings({ "resource", "unchecked" })
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int[] cnt1 = new int[1000001];
        int[] cnt2 = new int[1000001];
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) in.readObject();
        for (Integer i : a1) {
            if (check(i.toString())) {
                cnt1[i]++;
            }
        }
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) in.readObject();
        for (Integer i : a2) {
            if (check(i.toString())) {
                cnt2[i]++;
            }
        }
        int x = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                System.out.println(i + " " + cnt1[i] + cnt2[i]);
                x++;
            }
            if (x == 10) {
                break;
            }
        }
    }
}
