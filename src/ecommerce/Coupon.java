package ecommerce;
import java.util.Date;

public class Coupon {
    private int couponID;
    private String discount;
    private String code;
    private Date expiryDate;
    private Commodity applicableCommodity;
    private boolean isActive;

    public Coupon(int couponID, String discount, String code, Date expiryDate, Commodity applicableCommodity, boolean isActive) {
        this.couponID = couponID;
        this.discount = discount;
        this.code = code;
        this.expiryDate = expiryDate;
        this.applicableCommodity = applicableCommodity;
        this.isActive = isActive;
    }

    public void checkCoupon() {
        // 実装
    }

    public void updateCoupon() {
        // 実装
    }

    // すべての属性のゲッターとセッター
}
