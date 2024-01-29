package com.forStudy.OnlineShopping.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userKey;
    private String userId;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private Date regDate;
    private String grade;
}
