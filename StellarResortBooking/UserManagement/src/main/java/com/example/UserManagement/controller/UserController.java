package com.example.UserManagement.controller;

import com.example.UserManagement.client.RoomClient;
import com.example.UserManagement.client.RoomManagementClient;
import com.example.UserManagement.dto.AllDetailsDto;
import com.example.UserManagement.model.*;
import com.example.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User setUserDetails(@RequestBody User user) {
        return userService.setUserDetail(user);
    }

    @GetMapping("/user")
    public List<User> getUserDetails() {
        return userService.getUserDetail();
    }

    @GetMapping("/getallbookedroom/{uId}")
    public AllDetailsDto getAllBookedRoom(@PathVariable Integer uId) {
        return userService.getAllDetails(uId);
    }

    //get room by booking Id
//    @GetMapping("/getbookedroom/{bid}")
//    public AllDetailsBidDto getBookedRoomByBid(@PathVariable Integer bid){
//        return userService.bookedRoom(bid);
//    }

}
