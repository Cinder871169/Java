import java.util.Scanner;

public class J02013 {
    public static void bubbleSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int k = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    k = 1;
                }
            }
            if (k == 0)
                break;
            System.out.printf("Buoc %d: ", i + 1);
            for (int x = 0; x < n; x++) {
                System.out.printf("%d ", a[x]);
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
        bubbleSort(a, n);
    }
}
