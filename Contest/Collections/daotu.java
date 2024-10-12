package Contest.Collections;

import java.util.Scanner;
import java.util.Stack;

public class daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().split(" ");
            Stack<String> st = new Stack<>();
            for (String it : s) {
                st.push(it);
            }
            while (!st.empty()) {
                System.out.print(st.pop() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
