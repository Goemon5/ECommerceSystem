package ecommerce;
public class Order {
    private int orderID;
    private OrderInfo orderInfo;
    private String status;
    private DeliveryInfo deliveryInfo;
    private Payment payment;

    public Order(int orderID, OrderInfo orderInfo, String status, DeliveryInfo deliveryInfo, Payment payment) {
        this.orderID = orderID;
        this.orderInfo = orderInfo;
        this.status = status;
        this.deliveryInfo = deliveryInfo;
        this.payment = payment;
    }

    // Getters and Setters for all attributes
}
