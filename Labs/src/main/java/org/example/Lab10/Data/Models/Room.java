package org.example.Lab10.Data.Models;

public class Room {
    private long ID;
    private long Owner;
    private String GameStage;
    private long Timer;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getOwner() {
        return Owner;
    }

    public void setOwner(long owner) {
        Owner = owner;
    }

    public String getGameStage() {
        return GameStage;
    }

    public void setGameStage(String gameStage) {
        GameStage = gameStage;
    }

    public long getTimer() {
        return Timer;
    }

    public void setTimer(long timer) {
        Timer = timer;
    }

    public long getChat() {
        return Chat;
    }

    public void setChat(long chat) {
        Chat = chat;
    }

    private long Chat;
}
