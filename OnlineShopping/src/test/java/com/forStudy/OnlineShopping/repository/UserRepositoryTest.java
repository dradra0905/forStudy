package com.forStudy.OnlineShopping.repository;

import com.forStudy.OnlineShopping.data.entity.User;
import com.forStudy.OnlineShopping.data.repository.BookRepository;
import com.forStudy.OnlineShopping.data.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void insertUser(){
        User user = new User();
        user.setEmail("choihyunsu@ajou.ac.kr");
        user.setPassword("1234");
        user.setName("이권민");
        user.setPhoneNumber("010-6520-5465");
        user.setGrade("그냥노예");

        userRepository.save(user);
    }
}
