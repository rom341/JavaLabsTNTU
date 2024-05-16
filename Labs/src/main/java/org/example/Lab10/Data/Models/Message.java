package org.example.Lab10.Data.Models;

public class Message {
    private long ID;
    private long Sender;
    private long SendTime;
    private String MessageText;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getSender() {
        return Sender;
    }

    public void setSender(long sender) {
        Sender = sender;
    }

    public long getSendTime() {
        return SendTime;
    }

    public void setSendTime(long sendTime) {
        SendTime = sendTime;
    }

    public String getMessageText() {
        return MessageText;
    }

    public void setMessageText(String messageText) {
        MessageText = messageText;
    }
}
