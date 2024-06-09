package com.example.RoomManagement.repository;

import com.example.RoomManagement.model.RoomManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomManagementRepository extends JpaRepository<RoomManagement , Integer> {
    //query generates room id for booking Id
    @Query(value = "SELECT r_id FROM room_management WHERE b_id = :bId", nativeQuery = true)
    public Integer GetRoomID(@Param("bId") Integer bId);

    //guery generates room id for user id
    @Query(value = "SELECT r_id FROM room_management WHERE u_id = :uId", nativeQuery = true)
    public List<Integer> GetRoomIDs(@Param("uId") Integer uId);


}
