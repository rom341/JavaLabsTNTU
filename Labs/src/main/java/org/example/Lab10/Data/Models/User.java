package org.example.Lab10.Data.Models;

public class User {
    private long ID;
    private String Login;
    private String Name;
    private long Status;
    private long Role;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getStatus() {
        return Status;
    }

    public void setStatus(long status) {
        Status = status;
    }

    public long getRole() {
        return Role;
    }

    public void setRole(long role) {
        Role = role;
    }
}
