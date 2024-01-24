package com.forStudy.OnlineShopping.repository;

import com.forStudy.OnlineShopping.data.entity.Address;
import com.forStudy.OnlineShopping.data.entity.Book;
import com.forStudy.OnlineShopping.data.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        book.setAuthor("이자하");
        book.setPrice("10000");
        bookRepository.save(book);
    }
    @Test
    public void testFindBook(){
        Book book = new Book();
        book.setTitle("광마회귀");
        book.setAuthor("이자하");
        book.setPrice("10000");
        bookRepository.save(book);

        Optional<Book> result = bookRepository.findById(1L);
        System.out.println("======================");

        if(result.isPresent()){
            Book book1 = result.get();
            System.out.println(book1);
        }
    }
}
