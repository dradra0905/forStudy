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
    private Long USER_KEY;
    private String USER_ID;
    private String PASSWORD;
    private String NAME;
    private String EMAIL;
    private String PHONE_NUMBER;
    private String ADDRESS;
    private Date REG_DATE;
    private String GRADE;
}
