package org.example.Lab10.Data.Models;

public class Status {
    private long ID;
    private boolean IsAlive;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public boolean isAlive() {
        return IsAlive;
    }

    public void setAlive(boolean alive) {
        IsAlive = alive;
    }
}
