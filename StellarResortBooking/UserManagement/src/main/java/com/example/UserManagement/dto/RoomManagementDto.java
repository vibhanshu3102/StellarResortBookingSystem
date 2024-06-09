package com.example.UserManagement.dto;

public class RoomManagementDto {
    private Integer bId;
    private Integer uId;
    private Integer rId;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public RoomManagementDto(){

    }

    @Override
    public String toString() {
        return "RoomManagement{" +
                "bId=" + bId +
                ", uId=" + uId +
                ", rId=" + rId +
                '}';
    }
}
