package ecommerce;
import java.util.Date;

public class Message {
    private int messageID;
    private User sender;
    private User receiver;
    private String content;
    private Date sendDate;

    public Message(int messageID, User sender, User receiver, String content, Date sendDate) {
        this.messageID = messageID;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.sendDate = sendDate;
    }

    // すべての属性のゲッターとセッター
}
