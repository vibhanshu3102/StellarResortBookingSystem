package com.example.RoomManagement.dto;

import lombok.Data;

public class Room {
    private Integer rId;
    private String rType;

    public Room(){}


    @Override
    public String toString() {
        return "Room{" +
                "rId=" + rId +
                ", rType='" + rType + '\'' +
                '}';
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
}
