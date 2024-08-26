import java.util.*;

public class J03009 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] a = sc.nextLine().split(" ");
            String b = sc.nextLine();
            Set<String> st = new HashSet<>();
            for (String i : a) {
                if (!b.contains(i)) {
                    st.add(i);
                }
            }
            for (String i : st) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
