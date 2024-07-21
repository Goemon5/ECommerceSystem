
package ecommerce;
import java.util.ArrayList;

public class Cart {
    private int cartID;
    private ArrayList<Commodity> commodities;

    public Cart(int cartID) {
        this.cartID = cartID;
        this.commodities = new ArrayList<>();
    }

    public void addCommodity(Commodity commodity) {
        this.commodities.add(commodity);
    }

    public void removeCommodity(Commodity commodity) {
        this.commodities.remove(commodity);
    }

    // すべての属性のゲッターとセッター
}
