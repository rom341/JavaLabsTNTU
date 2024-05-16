package org.example.Lab10.Data.Models;

public class ServiceToRoomConnection {
    private long ID;
    private long ServiceID;
    private long RoomID;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getServiceID() {
        return ServiceID;
    }

    public void setServiceID(long serviceID) {
        ServiceID = serviceID;
    }

    public long getRoomID() {
        return RoomID;
    }

    public void setRoomID(long roomID) {
        RoomID = roomID;
    }
}
