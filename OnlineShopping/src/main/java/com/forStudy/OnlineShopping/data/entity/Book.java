package com.forStudy.OnlineShopping.data.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@Table(name="book")
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column
    private String subject;

    @Column
    private String publisher;

    @Column
    private String page;

    @Column
    private String image;

    @Column
    private String BookIndex;

    @Column
    private String intro;

    @Column
    private String inputDate;


    @Column(nullable = false)
    private String price;

}
