package com.example.RoomManagement.controller;

import com.example.RoomManagement.dto.BookedByUidDto;
import com.example.RoomManagement.dto.GetRoomByBidDto;
import com.example.RoomManagement.model.RoomManagement;
import com.example.RoomManagement.service.RoomManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomManagementController {
    @Autowired
    RoomManagementService roomManagementService;

    @PostMapping("/roommanagement")
    public RoomManagement setDetails(@RequestBody RoomManagement roomManagement){
        return roomManagementService.setDetail(roomManagement);
    }
    @GetMapping("/roommanagement")
    public List<RoomManagement> getDetails(@RequestBody RoomManagement roomManagement){
        return roomManagementService.getDetail(roomManagement);
    }

    @GetMapping("/getbookedroom/{bid}")
    public GetRoomByBidDto getBookedRoom(@PathVariable Integer bid)
    {
        return roomManagementService.getBookedRoomByBid(bid);
    }

    @GetMapping("/getallbookedroom/{uId}")
    public BookedByUidDto getAllBookedRoom(@PathVariable Integer uId){
            return  roomManagementService.getAllBookedRooms(uId);
    }

}
