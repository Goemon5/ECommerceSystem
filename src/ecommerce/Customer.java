package ecommerce;
import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Cart> cart;

    public Customer(String uID, String uName, String email, String password, String address, String tel, String credit, boolean status) {
        super(uID, uName, email, password, address, tel, credit, status);
        this.cart = new ArrayList<>();
    }

    public void addOrder(Order order) {
        // implementation
    }

    public void modifyOrder(Order order) {
        // implementation
    }

    public void deleteOrder(Order order) {
        // implementation
    }

    public void addCart(Order order) {
        // implementation
    }

    public void addReview(Review review) {
        // implementation
    }

    public void deleteCart(Order order) {
        // implementation
    }

    public void getShopReview(Shop shop) {
        // implementation
    }

    // Getters and Setters for cart
}
