package ecommerce;
import java.util.ArrayList;

public class Shop {
    private int shopID;
    private String shopName;
    private ArrayList<Commodity> commodities;
    private ArrayList<Advertisement> advertisements;
    private ArrayList<Review> reviews;
    private ArrayList<ShopManager> managers;

    public Shop(int shopID, String shopName) {
        this.shopID = shopID;
        this.shopName = shopName;
        this.commodities = new ArrayList<>();
        this.advertisements = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.managers = new ArrayList<>();
    }

    // すべての属性のゲッターとセッター
}
