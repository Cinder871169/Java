import java.util.*;

public class J01009 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long s = 1;
        long k = 1;
        for (int i = 2; i <= n; i++) {
            k *= i;
            s += k;
        }
        System.out.print(s);
    }
}
