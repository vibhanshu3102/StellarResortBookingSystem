package com.example.UserManagement.client;
import com.example.UserManagement.dto.BookedByUidDto;
import com.example.UserManagement.dto.GetRoomByBidDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RoomManagement")
public interface RoomManagementClient {

    @GetMapping("/getbookedroom/{bid}")
    public GetRoomByBidDto getBookedRoom(@PathVariable Integer bid);

    @GetMapping("/getallbookedroom/{uId}")
    public BookedByUidDto getAllBookedRoom(@PathVariable Integer uId);
}
