import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07029 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> l = (ArrayList<Integer>) in.readObject();
        int N = (int) 1e6, cnt = 0;
        int a[] = new int[N + 1];
        for (Integer i : l) {
            a[i]++;
        }
        for (int i = N; i >= 2; i--) {
            if (prime(i) && a[i] > 0) {
                System.out.println(i + " " + a[i]);
                cnt++;
                if (cnt == 10)
                    break;
            }
        }
        in.close();
    }
}
