package org.example.Lab10.Data.Models;

public class ChatToRoleConnection {
    private long ID;
    private long ChatID;
    private long RoleID;

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

    public long getRoleID() {
        return RoleID;
    }

    public void setRoleID(long roleID) {
        RoleID = roleID;
    }
}
