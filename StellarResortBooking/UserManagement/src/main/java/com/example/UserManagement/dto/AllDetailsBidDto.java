package com.example.UserManagement.dto;

import com.example.UserManagement.model.User;
import lombok.Data;

@Data
public class AllDetailsBidDto {
    private User user;
    private GetRoomByBidDto getRoomByBidDto;
}
