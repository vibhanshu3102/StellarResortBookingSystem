package com.example.RoomBooking.controller;

import com.example.RoomBooking.model.Room;
import com.example.RoomBooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;

    @PostMapping("/room")
    public Room setRoomDetails(@RequestBody Room room){
        return roomService.setRoomdetail(room);
    }

    @GetMapping("/room")
    public List<Room> getRoomDetails(){
        return roomService.getRoomDetails();
    }
    @GetMapping("/roomtype/{rId}")
    public Room getRoomTypes(@PathVariable Integer rId){
        return roomService.getRoomtype(rId);
    }
}
