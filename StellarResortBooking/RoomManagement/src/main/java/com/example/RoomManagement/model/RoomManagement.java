package com.example.RoomManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.util.List;

@Entity
public class RoomManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public RoomManagement(){

    }

    @Override
    public String toString() {
        return "RoomManagement{" +
                "bId=" + bId +
                ", uId=" + uId +
                ", rIdList=" + rId +
                '}';
    }
}
