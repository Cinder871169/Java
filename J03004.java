import java.util.Scanner;
import java.util.Vector;

public class J03004 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> v = new Vector<String>();
            String k = "";
            s = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (!k.isEmpty()) {
                        v.add(k);
                        k = "";
                    }
                } else {
                    k += s.charAt(i);
                }
            }
            if (!k.isEmpty()) {
                v.add(k);
            }

            for (int i = 0; i < v.size(); i++) {
                String res = v.get(i);
                System.out.print(res.substring(0, 1).toUpperCase() + res.substring(1));
                if (i < v.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
