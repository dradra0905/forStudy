package com.forStudy.OnlineShopping.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookDto {
    private Long bookId;
    private String title;
    private String author;
    private String subject;
    private String publisher;
    private String page;
    private String image;
    private String index;
    private String intro;
    private String inputDate;

}
