import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (st.empty()) {
                st.push(k);
            } else {
                if ((st.peek() + k) % 2 == 0) {
                    st.pop();
                } else {
                    st.push(k);
                }
            }
        }
        System.out.println(st.size());
    }
}
