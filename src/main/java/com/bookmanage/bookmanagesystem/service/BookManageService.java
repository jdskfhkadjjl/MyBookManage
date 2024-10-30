package com.bookmanage.bookmanagesystem.service;

import com.bookmanage.bookmanagesystem.pojo.BookRequests;
import com.bookmanage.bookmanagesystem.pojo.BookTypes;
import com.bookmanage.bookmanagesystem.pojo.Books;

import java.util.List;

public interface BookManageService {
    List<Books> getAllBooks(BookRequests bookRequests);
    List<BookTypes> getAllBookTypes();
    Integer getCountsOfBooks(String bookTypeId);
}
