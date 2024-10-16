package com.bookmanage.bookmanagesystem.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data//如果没有这个注解，没有为每个字段创建一个get，set方法，那么查询到的结果就是空的
public class Books {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private Double bookPrice;
    private Integer bookTypeId;
    private String bookDesc;
    private Integer isBorrowed;
    private String bookImg;
}
