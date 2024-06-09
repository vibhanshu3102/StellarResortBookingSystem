package com.example.UserManagement.client;

import com.example.UserManagement.model.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "RoomBooking")
public interface RoomClient {
    @GetMapping("/roomtype/{rId}")
    public Optional<Room> getRoomTypes(@PathVariable Integer rId);
}
