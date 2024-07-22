package ecommerce;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.login(true);
        Product product = new Product("1", "Sample Product", 100.0);
        customer.selectProduct(product);
        customer.reviewCart();
        customer.proceedToCheckout();
        customer.enterAddress("123 Main St");
        customer.enterPaymentInfo("4111111111111111");
        customer.confirmOrder();
    }
}
