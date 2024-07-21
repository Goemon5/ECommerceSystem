package ecommerce;
import java.util.ArrayList;

public class Supplier {
    private int supplierID;
    private String supplierName;
    private ArrayList<Commodity> commodities;

    public Supplier(int supplierID, String supplierName) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.commodities = new ArrayList<>();
    }

    // すべての属性のゲッターとセッター
}
