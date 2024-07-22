package ecommerce;

public class Customer {
    private CustomerState state;
    private Cart cart;

    public Customer() {
        this.state = CustomerState.AUTHENTICATING;
        this.cart = new Cart();
    }

    // State transition methods
    public void login(boolean success) {
        if (success) {
            this.state = CustomerState.BROWSING;
            displayProducts();
        } else {
            System.out.println("Login failed");
        }
    }

    public void selectProduct(Product product) {
        if (state == CustomerState.BROWSING) {
            addToCart(product);
        } else {
            System.out.println("Cannot select product in current state: " + state);
        }
    }

    public void reviewCart() {
        if (state == CustomerState.ADDING_TO_CART || state == CustomerState.BROWSING) {
            this.state = CustomerState.REVIEWING_CART;
            displayCartContents();
        } else {
            System.out.println("Cannot review cart in current state: " + state);
        }
    }

    public void proceedToCheckout() {
        if (state == CustomerState.REVIEWING_CART) {
            this.state = CustomerState.PROCEEDING_TO_CHECKOUT;
            enterAddress();
        } else {
            System.out.println("Cannot proceed to checkout in current state: " + state);
        }
    }

    public void enterAddress(String address) {
        if (state == CustomerState.PROCEEDING_TO_CHECKOUT) {
            if (isValidAddress(address)) {
                saveAddress(address);
                this.state = CustomerState.ENTERING_PAYMENT_METHOD;
                enterPaymentInfo();
            } else {
                System.out.println("Invalid address");
            }
        } else {
            System.out.println("Cannot enter address in current state: " + state);
        }
    }

    public void enterPaymentInfo(String paymentInfo) {
        if (state == CustomerState.ENTERING_PAYMENT_METHOD) {
            if (isValidPaymentInfo(paymentInfo)) {
                savePaymentInfo(paymentInfo);
                this.state = CustomerState.CONFIRMING_ORDER;
                displayOrderSummary();
            } else {
                System.out.println("Invalid payment information");
            }
        } else {
            System.out.println("Cannot enter payment information in current state: " + state);
        }
    }

    public void confirmOrder() {
        if (state == CustomerState.CONFIRMING_ORDER) {
            submitOrder();
            System.out.println("Order confirmed");
        } else {
            System.out.println("Cannot confirm order in current state: " + state);
        }
    }

    // Action methods
    private void displayProducts() {
        // Implementation for displaying products
    }

    private void addToCart(Product product) {
        if (state == CustomerState.BROWSING) {
            this.state = CustomerState.ADDING_TO_CART;
            cart.addProduct(product);
            confirmAddition();
        } else {
            System.out.println("Cannot add to cart in current state: " + state);
        }
    }

    private void confirmAddition() {
        // Confirm addition to cart
    }

    private void displayCartContents() {
        // Implementation for displaying cart contents
    }

    private void enterAddress() {
        // Prompt user to enter address
    }

    private void saveAddress(String address) {
        // Save address information
    }

    private void enterPaymentInfo() {
        // Prompt user to enter payment information
    }

    private void savePaymentInfo(String paymentInfo) {
        // Save payment information
    }

    private void displayOrderSummary() {
        // Display order summary for confirmation
    }

    private void submitOrder() {
        // Submit the order
    }

    private boolean isValidAddress(String address) {
        // Validate address
        return true;
    }

    private boolean isValidPaymentInfo(String paymentInfo) {
        // Validate payment information
        return true;
    }
}
