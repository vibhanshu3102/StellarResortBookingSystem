package com.example.RoomManagement.client;
import com.example.RoomManagement.dto.Room;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@FeignClient(name = "RoomBooking")
public interface RoomClient {

    @GetMapping("/roomtype/{rId}")
    public Room getRoomTypes(@PathVariable Integer rId);
}
