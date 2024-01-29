package com.forStudy.OnlineShopping.data.repository;

import com.forStudy.OnlineShopping.data.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
