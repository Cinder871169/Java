import java.util.Scanner;

public class J02010 {
    public static void InterchangeSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.printf("Buoc %d: ", i + 1);
            for (int k = 0; k < n; k++) {
                System.out.printf("%d ", a[k]);
            }
            System.out.println();
        }
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        InterchangeSort(a, n);
    }
}
