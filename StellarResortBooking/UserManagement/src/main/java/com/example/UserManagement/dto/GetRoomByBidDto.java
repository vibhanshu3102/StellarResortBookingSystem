package com.example.UserManagement.dto;

import com.example.UserManagement.model.Room;
import lombok.Data;

@Data
public class GetRoomByBidDto {
    //private RoomManagementDto roomManagement;
    private Integer biD;
    private Room room;
}
