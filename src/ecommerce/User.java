package ecommerce;


public class User {
    private String uID;
    private String uName;
    private String email;
    private String password;
    private String address;
    private String tel;
    private String credit;
    private boolean status;

    public User(String uID, String uName, String email, String password, String address, String tel, String credit, boolean status) {
        this.uID = uID;
        this.uName = uName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.tel = tel;
        this.credit = credit;
        this.status = status;
    }

    // すべての属性のゲッターとセッター
}
