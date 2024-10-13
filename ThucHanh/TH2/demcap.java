package ThucHanh.TH2;

import java.util.*;

class Pair {
    int fi, se;

    Pair(int fi, int se) {
        this.fi = fi;
        this.se = se;
    }

    public int getValue() {
        return fi;
    }

    public int getCount() {
        return se;
    }

    public void addCount() {
        se++;
    }
}

public class demcap {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Stack<Pair> st = new Stack<>();
        long res = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            while (!st.empty() && st.peek().getValue() < a) {
                res += st.peek().getCount();
                st.pop();
            }
            if (!st.empty()) {
                if (st.peek().getValue() == a) {
                    res += st.peek().getCount();
                    st.peek().addCount();
                    if (st.size() > 1) {
                        res++;
                    }
                } else {
                    res++;
                    st.push(new Pair(a, 1));
                }
            } else {
                st.push(new Pair(a, 1));
            }
        }
        System.out.println(res);
    }
}
