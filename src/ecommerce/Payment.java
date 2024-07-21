package ecommerce;
import java.util.Date;

public class Payment {
    private int paymentID;
    private double amount;
    private Date paymentDate;
    private User payer;
    private String method;
    private double transactionFee;

    public Payment(int paymentID, double amount, Date paymentDate, User payer, String method, double transactionFee) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.payer = payer;
        this.method = method;
        this.transactionFee = transactionFee;
    }

    // Getters and Setters for all attributes
}
