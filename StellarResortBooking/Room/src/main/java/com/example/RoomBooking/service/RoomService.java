package com.example.RoomBooking.service;

import com.example.RoomBooking.model.Room;
import com.example.RoomBooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;


    public Room setRoomdetail(Room room) {
     return roomRepository.save(room);
    }

    public List<Room> getRoomDetails(){
        return roomRepository.findAll();
    }

    public Room getRoomtype(Integer rId) {
        return roomRepository.findById(rId).get();
    }
}
