package ecommerce;
import java.util.ArrayList;

public class Administrator {
    private int adminID;
    private ArrayList<String> adminPrivileges;
    private ArrayList<User> users;
    private ArrayList<Shop> shops;

    public Administrator(int adminID) {
        this.adminID = adminID;
        this.adminPrivileges = new ArrayList<>();
        this.users = new ArrayList<>();
        this.shops = new ArrayList<>();
    }

    // すべての属性のゲッターとセッター
}
