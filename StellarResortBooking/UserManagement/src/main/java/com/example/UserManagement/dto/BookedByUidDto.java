package com.example.UserManagement.dto;

import com.example.UserManagement.model.Room;
import lombok.Data;

import java.util.List;

@Data
public class BookedByUidDto {
    private Integer uId;
    private List<Room> room;
}
