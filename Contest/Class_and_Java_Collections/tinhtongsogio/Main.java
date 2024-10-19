package Contest.Class_and_Java_Collections.tinhtongsogio;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GioChuan x = new GioChuan();
        x.docGV("GIANGVIEN.in");
        x.docGioChuan("GIOCHUAN.in");
        x.print();
    }
}
