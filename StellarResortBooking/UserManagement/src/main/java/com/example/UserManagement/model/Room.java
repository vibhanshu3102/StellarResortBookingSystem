package com.example.UserManagement.model;

public class Room {
    private Integer rId;
    private String rType;

    public Room(){

    }

    @Override
    public String toString() {
        return "RoomDto{" +
                "rId=" + rId +
                ", rType='" + rType + '\'' +
                '}';
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

    public Room(String rType, Integer rId) {
        this.rType = rType;
        this.rId = rId;
    }
}
