package ecommerce;
import java.util.ArrayList;

public class Commodity {
    private int commodityID;
    private String commodityName;
    private double price;
    private String description;
    private String category;
    private ArrayList<Review> reviews;

    public Commodity(int commodityID, String commodityName, double price, String description, String category) {
        this.commodityID = commodityID;
        this.commodityName = commodityName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.reviews = new ArrayList<>();
    }

    public void applyCoupon(Coupon coupon) {
        // implementation
    }

    public void deleteReview(Review review) {
        // implementation
    }

    public void updateShipping(String shippingDescription) {
        // implementation
    }

    public void updatePrice(double price) {
        // implementation
    }

    public void updateCommodityName(String commodityName) {
        // implementation
    }

    // Getters and Setters for all attributes
}
