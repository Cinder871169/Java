package Contest.Class_and_Java_Collections.baohanhsp;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        ArrayList<Product> p = new ArrayList<>();
        ArrayList<Order> o = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String productID = sc.nextLine();
            String productName = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int baohanh = Integer.parseInt(sc.nextLine());
            p.add(new Product(productID, productName, price, baohanh));
        }

        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String address = sc.nextLine();
            String productID = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            String date = sc.nextLine();

            Product product = p.stream().filter(x -> x.getProductID().equals(productID)).findFirst().orElse(null);
            if (product != null) {
                Customer customer = new Customer(name, address, productID, num, date);
                o.add(new Order(customer, product));
            }
        }
        sc.close();
        Collections.sort(o);
        for (Order i : o) {
            System.out.println(i);
        }
    }
}
