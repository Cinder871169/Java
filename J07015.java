import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.lang.Math;

public class J07015 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        int a[] = new int[100001];
        for (Integer it : list) {
            a[it]++;
        }
        for (int i = 2; i < 100000; i++) {
            if (a[i] > 0 && prime(a[i])) {
                System.out.print(i + " " + a[i]);
            }
        }
    }
}
