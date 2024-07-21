package ecommerce;
public class Advertisement {
    private int adID;
    private String adName;
    private String content;
    private String createDate;
    private boolean isActive;

    public Advertisement(int adID, String adName, String content, String createDate, boolean isActive) {
        this.adID = adID;
        this.adName = adName;
        this.content = content;
        this.createDate = createDate;
        this.isActive = isActive;
    }

    public void activateAdvertisement() {
        // 実装
    }

    public void deleteAdvertisement() {
        // 実装
    }

    public void updateAdvertisement() {
        // 実装
    }

    // すべての属性のゲッターとセッター
}
