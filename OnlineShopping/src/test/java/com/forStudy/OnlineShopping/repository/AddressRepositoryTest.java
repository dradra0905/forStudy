package com.forStudy.OnlineShopping.repository;

import com.forStudy.OnlineShopping.data.entity.Address;
import com.forStudy.OnlineShopping.data.entity.User;
import com.forStudy.OnlineShopping.data.repository.AddressRepository;
import com.forStudy.OnlineShopping.data.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddressRepositoryTest {
    @Autowired
    AddressRepository addressRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    public void insertAddress(){
        User user = new User();
        user.setEmail("choihyunsu@ajou.ac.kr");
        user.setPassword("1234");
        user.setName("이권민");
        user.setPhoneNumber("010-6520-5465");
        user.setGrade("그냥노예");
        userRepository.save(user);

        Address address = new Address();
        address.setAddress("경기도 용인시 수지구 신봉2로 26 116-202");
        address.setUser(user);
        addressRepository.save(address);
    }
}
