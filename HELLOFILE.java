import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner x = new Scanner(new File("Hello.txt"));
        while(x.hasNextLine())
            System.out.println(x.nextLine());
        x.close(); 
    }
}
