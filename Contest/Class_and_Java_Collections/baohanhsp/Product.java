package Contest.Class_and_Java_Collections.baohanhsp;

public class Product {
    private String productID;
    private String productName;
    private int price;
    private int baohanh;

    public Product(String productID, String productName, int price, int baohanh) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.baohanh = baohanh;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getBaohanh() {
        return baohanh;
    }

}
