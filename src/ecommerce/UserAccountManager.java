package ecommerce;
import java.util.ArrayList;

public class UserAccountManager {
    private int accountManagerID;
    private ArrayList<User> users;

    public UserAccountManager(int accountManagerID) {
        this.accountManagerID = accountManagerID;
        this.users = new ArrayList<>();
    }

    public void createUserAccount(User user) {
        // 実装
    }

    public void deleteUserAccount(User user) {
        // 実装
    }

    public void modifyUserAccount(User user) {
        // 実装
    }

    public void setUserPermissions(User user) {
        // 実装
    }

    // すべての属性のゲッターとセッター
}
