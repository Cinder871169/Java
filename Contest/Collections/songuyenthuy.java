package Contest.Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class songuyenthuy {

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("4");
            q.add("5");

            StringBuilder res = new StringBuilder();
            int count = 0;

            while (!q.isEmpty() && count < n) {
                String x = q.poll();

                String s = x + reverse(x);
                res.append(s).append(" ");
                count++;

                q.add(x + '4');
                q.add(x + '5');
            }

            System.out.println(res.toString().trim());
        }

        sc.close();
    }
}
