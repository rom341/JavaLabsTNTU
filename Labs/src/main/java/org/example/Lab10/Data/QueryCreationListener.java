package org.example.Lab10.Data;

import org.example.Lab10.Data.Models.*;

public interface QueryCreationListener {
        void onQueryCreate(Service service);
        void onQueryCreate(Room room);
        void onQueryCreate(User user);
        void onQueryCreate(Chat chat);
        void onQueryCreate(ChatToMessageConnection CtM);
        void onQueryCreate(ChatToRoleConnection CtR);
        void onQueryCreate(Message message);
        void onQueryCreate(Role role);
        void onQueryCreate(RoomToUserConnection RtU);
        void onQueryCreate(ServiceToRoomConnection StR);
        void onQueryCreate(Status status);
        void onQueryCreate(Timer timer);
}

