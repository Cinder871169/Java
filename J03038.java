import java.util.Scanner;

public class J03038 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int a[] = new int[127], cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
        }
        for (int i = 0; i < 127; i++)
            if (a[i] != 0)
                cnt++;
        System.out.println(cnt);
    }
}
