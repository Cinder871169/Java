package Contest;

import java.util.*;

public class tangdangiamdan {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> se1 = new ArrayList<>();
            ArrayList<Integer> se2 = new ArrayList<>();

            Set<Integer> setSe1 = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    if (!setSe1.contains(x)) {
                        se1.add(x);
                        setSe1.add(x);
                    }
                } else {
                    if (!se2.contains(x)) {
                        se2.add(x);
                    }
                }
            }

            Collections.sort(se1);
            Collections.sort(se2, Collections.reverseOrder());

            for (int i : se1)
                System.out.print(i + " ");
            System.out.println();

            for (int i : se2)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
