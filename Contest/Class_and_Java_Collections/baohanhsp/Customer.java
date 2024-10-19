package Contest.Class_and_Java_Collections.baohanhsp;

public class Customer {
    private static int NUM = 1;
    private String id;
    private String name;
    private String address;
    private String productID;
    private int num;
    private String date;

    public Customer(String name, String address, String productID, int num, String date) {
        this.id = String.format("KH%02d", NUM++);
        this.name = name;
        this.address = address;
        this.productID = productID;
        this.num = num;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProductID() {
        return productID;
    }

    public int getNum() {
        return num;
    }

    public String getDate() {
        return date;
    }
}
