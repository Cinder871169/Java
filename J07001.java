import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
