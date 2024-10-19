package Contest.Class_and_Java_Collections;

import java.util.Scanner;
import java.util.Stack;

public class tiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String[] s = sc.nextLine().trim().split("\\s+");
            Stack<Long> st = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                String token = s[i];
                if (check(token)) {
                    st.push(Long.parseLong(token));
                } else {
                    long o1 = st.pop();
                    long o2 = st.pop();
                    long result = calc(o1, o2, token);
                    st.push(result);
                }
            }

            System.out.println(st.peek());
        }

        sc.close();
    }

    private static boolean check(String token) {
        try {
            Long.parseLong(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static long calc(long x, long y, String o) {
        switch (o) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                throw new IllegalArgumentException();
        }
    }
}
