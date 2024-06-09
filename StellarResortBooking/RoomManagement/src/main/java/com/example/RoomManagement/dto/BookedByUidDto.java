package com.example.RoomManagement.dto;

import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class BookedByUidDto {
    private Integer uId;
    private List<Room> room;
}
