import java.util.Scanner;

public class J03021a {
    public static Scanner sc = new Scanner(System.in);

    public static char press(char c) {
        switch (c) {
            case 'a':
            case 'b':
            case 'c':
                return '2';
            case 'd':
            case 'e':
            case 'f':
                return '3';
            case 'g':
            case 'h':
            case 'i':
                return '4';
            case 'j':
            case 'k':
            case 'l':
                return '5';
            case 'm':
            case 'n':
            case 'o':
                return '6';
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return '7';
            case 't':
            case 'u':
            case 'v':
                return '8';
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return '9';
        }
        return 'a';
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next().toLowerCase();
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                ans += press(s.charAt(i));
            }
            if (ans.equals(new StringBuilder(ans).reverse().toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
