package com.bookmanage.bookmanagesystem.service;

import com.bookmanage.bookmanagesystem.Mapper.SelectAllBooks;
import com.bookmanage.bookmanagesystem.pojo.BookRequests;
import com.bookmanage.bookmanagesystem.pojo.BookTypes;
import com.bookmanage.bookmanagesystem.pojo.Books;
import com.sun.org.apache.xml.internal.utils.BoolStack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
@Slf4j
public class BookManageServiceImp implements BookManageService{
    @Autowired
    private SelectAllBooks selectAllBooks;
    @Override
    public List<Books> getAllBooks(BookRequests bookRequests) {
        //log.info(bookRequests.getBookNames());
        return selectAllBooks.selectAllBooks(bookRequests);
    }
    public List<BookTypes> getAllBookTypes(){
//        List<BookTypes> list=selectAllBooks.selectAllBookTypes();
//        Iterator iterator=list.iterator();
//        log.info(iterator.next().toString());
        return selectAllBooks.selectAllBookTypes();
    }
    public Integer getCountsOfBooks(){
        return selectAllBooks.selectCountsOfBooks();
    }
}
