package ThucHanh.B8;

import java.util.*;

public class B8 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            Map<Integer, Integer> mpIndex = new HashMap<>();
            Map<Integer, Integer> mpCount = new HashMap<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (!mpIndex.containsKey(x)) {
                    mpIndex.put(x, i);
                    mpCount.put(x, 1);
                } else {
                    mpCount.put(x, mpCount.get(x) + 1);
                }
            }
            ArrayList<Number> list = new ArrayList<>();
            for (Integer i : mpIndex.keySet()) {
                int firstIndex = mpIndex.get(i);
                int count = mpCount.get(i);
                list.add(new Number(i, firstIndex, count));
            }
            Collections.sort(list);
            for (Number it : list) {
                for (int i = 0; i < it.getCount(); i++) {
                    System.out.print(it.getValue() + " ");
                }
            }
            System.out.println();
        }
    }
}
