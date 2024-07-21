package ecommerce;
public class DeliveryInfo {
    private int deliveryInfoID;
    private String deliveryStatus;
    private String serviceProvider;

    public DeliveryInfo(int deliveryInfoID, String deliveryStatus, String serviceProvider) {
        this.deliveryInfoID = deliveryInfoID;
        this.deliveryStatus = deliveryStatus;
        this.serviceProvider = serviceProvider;
    }

    public void updateDeliveryInfo() {
        // implementation
    }

    // Getters and Setters for all attributes
}
