package ThucHanh.TH2;

import java.util.*;
import java.lang.StringBuilder;

public class danhdausploi {

    public static String checkError(ArrayList<Integer> a) {
        StringBuilder res = new StringBuilder();
        int n = a.size();
        for (int i = 0; i < n; i++) {
            int start = a.get(i);
            while (i + 1 < n && a.get(i + 1) == a.get(i) + 1) {
                i++;
            }
            int end = a.get(i);
            if (start == end) {
                res.append(start);
            } else {
                res.append(start).append("-").append(end);
            }
            if (i < n - 1) {
                res.append(", ");
            }
        }
        int k = res.lastIndexOf(", ");
        if (k != -1) {
            res.replace(k, k + 2, " and ");
        }
        return res.toString();
    }

    public static String checkCorrect(int n, ArrayList<Integer> a) {
        StringBuilder res = new StringBuilder();
        int size = a.size();
        int pos = 0;
        for (int i = 0; i < size; i++) {
            int start = pos + 1;
            int end = a.get(i) - 1;
            if (start <= end) {
                if (start == end) {
                    res.append(start);
                } else {
                    res.append(start).append("-").append(end);
                }
                if (i < size - 1 || end < n) {
                    res.append(", ");
                }
            }
            pos = a.get(i);
        }
        if (pos < n) {
            int start = pos + 1;
            int end = n;
            if (start == end) {
                res.append(start);
            } else {
                res.append(start).append("-").append(end);
            }
        }
        int k = res.lastIndexOf(", ");
        if (k != -1) {
            res.replace(k, k + 2, " and ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        int n = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        ArrayList<Integer> lst = new ArrayList<>();
        String[] s = sc.nextLine().split(" ");
        for (String i : s) {
            lst.add(Integer.parseInt(i));
        }
        String errors = checkError(lst);
        System.out.println("Errors: " + errors);
        String corrects = checkCorrect(n, lst);
        System.out.println("Corrects: " + corrects);
    }
}
