package com.bookmanage.bookmanagesystem.Mapper;

import com.bookmanage.bookmanagesystem.pojo.BookRequests;
import com.bookmanage.bookmanagesystem.pojo.BookTypes;
import com.bookmanage.bookmanagesystem.pojo.Books;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SelectAllBooks {
    List<Books> selectAllBooks(BookRequests bookRequests);
    List<BookTypes> selectAllBookTypes();
    Integer selectCountsOfBooks(String bookTypeId);
}
