package com.forStudy.OnlineShopping.data.repository;

import com.forStudy.OnlineShopping.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
