package ecommerce;
import java.util.Date;

public class Review {
    private int reviewID;
    private int commodityID;
    private String customerID;
    private String content;
    private Date createDate;

    public Review(int reviewID, int commodityID, String customerID, String content, Date createDate) {
        this.reviewID = reviewID;
        this.commodityID = commodityID;
        this.customerID = customerID;
        this.content = content;
        this.createDate = createDate;
    }

    // Getters and Setters for all attributes
}
