package Contest.Class_and_Java_Collections.baohanhsp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Order implements Comparable<Order> {
    private Customer customer;
    private Product product;

    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public String getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String getCustomerAddress() {
        return customer.getAddress();
    }

    public String getProductID() {
        return product.getProductID();
    }

    public int getTotalPrice() {
        return product.getPrice() * customer.getNum();
    }

    public String getWarrantyEndDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date purchaseDate = sdf.parse(customer.getDate());
        Calendar c = Calendar.getInstance();
        c.setTime(purchaseDate);
        c.add(Calendar.MONTH, product.getBaohanh());
        return sdf.format(c.getTime());
    }

    @Override
    public String toString() {
        try {
            return String.format("%s %s %s %s %d %s", getCustomerId(), getCustomerName(), getCustomerAddress(),
                    getProductID(), getTotalPrice(), getWarrantyEndDate());
        } catch (ParseException e) {
            return "Invalid";
        }
    }

    @Override
    public int compareTo(Order other) {
        try {
            String thisWarrantyDate = this.getWarrantyEndDate();
            String otherWarrantyDate = other.getWarrantyEndDate();
            int dateComparison = thisWarrantyDate.compareTo(otherWarrantyDate);

            if (dateComparison != 0) {
                return dateComparison;
            }
            return this.getCustomerId().compareTo(other.getCustomerId());
        } catch (ParseException e) {
            return 0;
        }
    }
}
