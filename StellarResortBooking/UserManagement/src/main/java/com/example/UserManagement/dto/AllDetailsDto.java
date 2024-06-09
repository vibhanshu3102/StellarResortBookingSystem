package com.example.UserManagement.dto;

import com.example.UserManagement.model.User;
import lombok.Data;

@Data
public class AllDetailsDto {
    private User user;
   private BookedByUidDto bookedByUidDto;
}
