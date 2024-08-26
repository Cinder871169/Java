import java.util.Scanner;

public class J02012 {
    public static Scanner sc = new Scanner(System.in);

    public static void MergeSort(int a[], int n) {
        for (int i = 0; i < n; i++) {
            int current = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;

            System.out.print("Buoc " + i + ": ");
            printArray(a, i + 1);
        }
    }

    public static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        MergeSort(a, n);
    }
}
