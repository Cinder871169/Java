import java.util.Scanner;

public class J01016 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        int n = s.length();
        int x = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '4' || s.charAt(i) == '7')
                x++;
        if (x == 7 || x == 4)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = sc.next();
        if (check(s) == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
