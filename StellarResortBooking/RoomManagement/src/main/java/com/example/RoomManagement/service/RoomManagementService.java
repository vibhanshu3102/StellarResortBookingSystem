package com.example.RoomManagement.service;

import com.example.RoomManagement.client.RoomClient;
import com.example.RoomManagement.dto.BookedByUidDto;
import com.example.RoomManagement.dto.GetRoomByBidDto;
import com.example.RoomManagement.dto.Room;
import com.example.RoomManagement.model.RoomManagement;
import com.example.RoomManagement.repository.RoomManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomManagementService {

    @Autowired
    RoomManagementRepository roomManagementRepository;

    @Autowired
    RoomClient roomClient;

    //posting room management details on postman
    public RoomManagement setDetail(RoomManagement roomManagement) {
        return roomManagementRepository.save(roomManagement);
    }

    //getting room managemenet details on postman
    public List<RoomManagement> getDetail(RoomManagement roomManagement) {
        return roomManagementRepository.findAll();
    }

    //getting booked room by booking Id
    public GetRoomByBidDto getBookedRoomByBid(Integer bid) {
        GetRoomByBidDto getRoomByBidDto = new GetRoomByBidDto();
        getRoomByBidDto.setRoomManagement(roomManagementRepository.findById(bid).get());
        int rid = roomManagementRepository.GetRoomID(bid);
        Room room = roomClient.getRoomTypes(rid);
        getRoomByBidDto.setRoom(room);
        return getRoomByBidDto;
    }

    //getting all booked rooms with type using user Id
    public BookedByUidDto getAllBookedRooms(Integer uId) {
        BookedByUidDto bookedByUidDto = new BookedByUidDto();
        bookedByUidDto.setUId(uId);
        List<Room> roomList = new ArrayList<>();
        List<Integer> rIds = (roomManagementRepository.GetRoomIDs(uId));
        for (int i = 0; i<rIds.size();i++){
            int rid = rIds.get(i);
            roomList.add(roomClient.getRoomTypes(rid));
        }
        bookedByUidDto.setRoom(roomList);
        return bookedByUidDto;
    }
}
