package com.forStudy.OnlineShopping.data.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@ToString
@Getter
@Setter
@Table(name="book")
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("책ID")
    private Long bookId;

    @Comment("제목")
    @Column(nullable = false)
    private String title;

    @Comment("작가")
    @Column(nullable = false)
    private String author;

    @Comment("주제")
    @Column
    private String subject;

    @Comment("출판사")
    @Column
    private String publisher;

    @Comment("쪽수")
    @Column
    private String page;

    @Comment("이미지URL")
    @Column
    private String image;

    @Comment("목차")
    @Column
    private String BookIndex;

    @Comment("책소개")
    @Column
    private String intro;

    @Comment("등록날짜")
    @Column
    private String inputDate;


    @Column
    @Comment("가격")
    private String price;

    @Column
    @Comment("판매량")
    private String saleRate;

    @Column
    @Comment("재고")
    private String stock;

}
