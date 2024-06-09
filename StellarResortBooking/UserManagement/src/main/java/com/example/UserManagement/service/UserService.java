package com.example.UserManagement.service;

import com.example.UserManagement.client.RoomClient;
import com.example.UserManagement.client.RoomManagementClient;
import com.example.UserManagement.dto.AllDetailsDto;
import com.example.UserManagement.model.*;
import com.example.UserManagement.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    @Autowired
    RoomManagementClient roomManagementClient;
    // posting via postman and saving the user details
    public User setUserDetail(User user) {
       return userRepository.save(user);
    }

    //Getting all the details that have been send in the user table
    public List<User> getUserDetail(){
        return userRepository.findAll();
    }

//    public AllDetailsBidDto bookedRoom(Integer bid) {
//        AllDetailsBidDto allDetailsBidDto = new AllDetailsBidDto();
//        allDetailsBidDto.setUser(userRepository.findById(bid).get());
//        allDetailsBidDto.setGetRoomByBidDto(roomManagementClient.getBookedRoom(bid));
//        return  allDetailsBidDto;
//    }


    //getting all details of user and his booked room
    public AllDetailsDto getAllDetails(Integer uid) {
        AllDetailsDto allDetailsDto = new AllDetailsDto();
        allDetailsDto.setUser(userRepository.findById(uid).get());
        allDetailsDto.setBookedByUidDto(roomManagementClient.getAllBookedRoom(uid));
        allDetailsDto.toString();
        return allDetailsDto;
    }

}
