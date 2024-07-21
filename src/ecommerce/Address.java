package ecommerce;
public class Address {
    private int addressID;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address(int addressID, String street, String city, String state, String zip, String country) {
        this.addressID = addressID;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public void updateAddress() {
        // implementation
    }

    // Getters and Setters for all attributes
}
