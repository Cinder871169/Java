import java.util.Scanner;

public class J03027 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        while (true) {
            int flag = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    flag = 1;
                    s = s.substring(0, i - 1) + s.substring(i + 1);
                    break;
                }
            }
            if (flag == 0)
                break;
        }
        if (s.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(s);
    }
}
