package org.example.Lab10.Data.Models;

public class ChatToMessageConnection {
    private long ID;
    private long ChatID;
    private long MessageID;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getChatID() {
        return ChatID;
    }

    public void setChatID(long chatID) {
        ChatID = chatID;
    }

    public long getMessageID() {
        return MessageID;
    }

    public void setMessageID(long messageID) {
        MessageID = messageID;
    }
}
