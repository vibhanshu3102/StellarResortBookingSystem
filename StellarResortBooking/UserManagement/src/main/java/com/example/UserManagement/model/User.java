package com.example.UserManagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "stellar_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uId;
    private String name;
    private String email;
    private String pass;

    public User(Integer uId, String name, String email, String pass) {
        this.uId = uId;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public User(){

    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
