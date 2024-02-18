package com.forStudy.OnlineShopping.repository;

import com.forStudy.OnlineShopping.data.entity.Address;
import com.forStudy.OnlineShopping.data.entity.Book;
import com.forStudy.OnlineShopping.data.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    public void testClass(){
        System.out.println(bookRepository.getClass().getName());
    }

    @Test
    public void testBookSave(){
        Book book = new Book();
        book.setTitle("광마회귀");
        book.setAuthor("asd");
        book.setPrice("10000");
        bookRepository.save(book);
    }
    @Test
    public void testFindBook(){
        Book book = new Book();
        book.setTitle("화산귀환");
        book.setAuthor("청명");
        book.setPrice("15000");
        bookRepository.save(book);

        Optional<Book> result = bookRepository.findById(1L);
        System.out.println("======================");

        if(result.isPresent()){
            Book book1 = result.get();
            System.out.println(book1);
        }
    }
    @Test
    public void testPageDefault(){

        Book book = new Book();
        book.setTitle("나노마신");
        book.setAuthor("천마");
        book.setPrice("20000");
        bookRepository.save(book);

        Pageable pageable = PageRequest.of(0,10);
        Page<Book> result = bookRepository.findAll(pageable);
        System.out.println(result.getTotalPages());
    }
}
