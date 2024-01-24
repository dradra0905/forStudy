package com.forStudy.OnlineShopping.data.repository;

import com.forStudy.OnlineShopping.data.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
