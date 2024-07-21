package ecommerce;
import java.util.ArrayList;

public class ChatManager {
    private int chatID;
    private ArrayList<Message> messages;

    public ChatManager(int chatID) {
        this.chatID = chatID;
        this.messages = new ArrayList<>();
    }

    public void sendMessage(Message message) {
        // 実装
    }

    public void receiveMessage(Message message) {
        // 実装
    }

    public void deleteMessage(Message message) {
        // 実装
    }

    public void updateContent() {
        // 実装
    }

    // すべての属性のゲッターとセッター
}
