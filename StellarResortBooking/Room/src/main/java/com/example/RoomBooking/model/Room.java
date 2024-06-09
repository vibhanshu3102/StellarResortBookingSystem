package com.example.RoomBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class Room {
    @Id
    private Integer rId;
    private String rType;

    public Room(){

    }

    public Room(Integer rId, String rType) {
        this.rId = rId;
        this.rType = rType;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rId=" + rId +
                ", rType='" + rType + '\'' +
                '}';
    }
}
