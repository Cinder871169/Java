import java.util.Scanner;
import java.util.Vector;

public class J02105 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Vector<Vector<Integer>> v = new Vector<>();
        for (int i = 1; i <= n; i++) {
            Vector<Integer> x = new Vector<>();
            for (int j = 1; j <= n; j++) {
                int a = sc.nextInt();
                if (a == 1)
                    x.add(j);
            }
            v.add(x);
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ", i + 1);
            for (int j = 0; j < v.get(i).size(); j++)
                System.out.print(v.get(i).get(j) + " ");
            System.out.println();
        }
    }
}
