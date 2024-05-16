package org.example.Lab10.Data.Models;

public class RoomToUserConnection {
    private long ID;
    private long RoomID;
    private long UserID;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getRoomID() {
        return RoomID;
    }

    public void setRoomID(long roomID) {
        RoomID = roomID;
    }

    public long getUserID() {
        return UserID;
    }

    public void setUserID(long userID) {
        UserID = userID;
    }
}
