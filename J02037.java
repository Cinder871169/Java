import java.util.Scanner;

public class J02037 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String a[] = s.split(" ");
            int cnt1 = 0, cnt2 = 0, n = a.length;
            for (int i = 0; i < n; i++) {
                if (a[i].charAt(a[i].length() - 1) % 2 == 0)
                    cnt1++;
                else
                    cnt2++;
            }
            if (n % 2 == 0 && cnt1 > cnt2 || n % 2 == 1 && cnt1 < cnt2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
