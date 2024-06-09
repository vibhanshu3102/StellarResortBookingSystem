package com.example.RoomManagement.dto;

import com.example.RoomManagement.model.RoomManagement;
import lombok.Data;

@Data
public class GetRoomByBidDto {
    private RoomManagement roomManagement;
    private Room room;
}
