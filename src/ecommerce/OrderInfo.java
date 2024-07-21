package ecommerce;
import java.util.Date;

public class OrderInfo {
    private int orderInfoID;
    private Commodity commodity;
    private Customer customer;
    private Date orderDate;
    private int quantity;
    private double totalPrice;

    public OrderInfo(int orderInfoID, Commodity commodity, Customer customer, Date orderDate, int quantity, double totalPrice) {
        this.orderInfoID = orderInfoID;
        this.commodity = commodity;
        this.customer = customer;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters for all attributes
}
