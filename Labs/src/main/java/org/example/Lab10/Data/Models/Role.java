package org.example.Lab10.Data.Models;

public class Role {
    private long ID;
    private String Name;
    private String Description;
    private short Health;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public short getHealth() {
        return Health;
    }

    public void setHealth(short health) {
        Health = health;
    }

    public short getDamage() {
        return Damage;
    }

    public void setDamage(short damage) {
        Damage = damage;
    }

    public String getWinCondition() {
        return WinCondition;
    }

    public void setWinCondition(String winCondition) {
        WinCondition = winCondition;
    }

    private short Damage;
    private String WinCondition;
}
