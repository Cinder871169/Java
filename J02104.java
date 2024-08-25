import java.util.Scanner;

public class J02104 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (i <= j && x == 1)
                    System.out.printf("(%d,%d)\n", i, j);
            }
        }
    }
}
