package Contest;

import java.io.*;
import java.util.*;

class DN {
    private String id, name;
    private int num;

    public DN(String id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + num;
    }
}

public class dsdoanhnghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int num = sc.nextInt();
            DN x = new DN(id, name, num)
            System.out.println(x);
        }
    }
}
