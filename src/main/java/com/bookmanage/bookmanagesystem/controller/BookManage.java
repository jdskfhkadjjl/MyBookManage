package com.bookmanage.bookmanagesystem.controller;

import com.bookmanage.bookmanagesystem.pojo.BookRequests;
import com.bookmanage.bookmanagesystem.pojo.Books;
import com.bookmanage.bookmanagesystem.pojo.Result;
import com.bookmanage.bookmanagesystem.service.BookManageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class BookManage {
    @Autowired
    public BookManageService bookManageService;
    @Autowired
    public BookRequests bookRequests;


    @GetMapping("/books/all")
    public Result getAllBooks(@RequestParam(name = "bookName") String bookName,
                              @RequestParam(name = "bookEditer") String bookEditer,
                              @RequestParam("bookType") String bookType,
                              @RequestParam("startIndex") String startIndex,
                              @RequestParam("pageCount") String pageCount) {
        bookRequests.setBookNames(bookName);
        bookRequests.setBookEditers(bookEditer);
        log.info("books/all");
        log.info(bookName);
        if (bookType.equals("null")) {
            bookRequests.setBookTypeid(-1);
        } else {
            bookRequests.setBookTypeid(Integer.valueOf(bookType));
        }
        bookRequests.setStartIndex(Integer.valueOf(startIndex));
        bookRequests.setPageCount(Integer.valueOf(pageCount));
        List<Books> o = bookManageService.getAllBooks(bookRequests);
        return Result.success(o);
    }

    @GetMapping("/books/types")//这里的路径名要写全，不要只写一个tp，不然访问的时候会发生错误
    public Result getAllBooksType() {
        return Result.success(bookManageService.getAllBookTypes());
    }

    @GetMapping("/books/counts")
    public Result getCountsOfBooks(@RequestParam String bookTypeId){
        return Result.success(bookManageService.getCountsOfBooks(bookTypeId));
    }




}
