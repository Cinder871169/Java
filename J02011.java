import java.util.Scanner;

public class J02011 {
    public static void selectionSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j])
                    min = j;
            }
            int tmp;
            tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
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
        selectionSort(a, n);
    }
}
