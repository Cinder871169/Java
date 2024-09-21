import java.io.*;
import java.util.*;

class DN implements Comparable<DN> {
    private String id, name;
    private int num;

    public DN(String id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(DN o) {
        return id.compareTo(o.getId());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + num;
    }
}

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DN> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            DN x = new DN(id, name, num);
            l.add(x);
        }
        Collections.sort(l);
        for (DN i : l) {
            System.out.println(i);
        }
        sc.close();
    }
}
