package com.bookmanage.bookmanagesystem.controller;

import com.bookmanage.bookmanagesystem.pojo.BookRequests;
import com.bookmanage.bookmanagesystem.pojo.Books;
import com.bookmanage.bookmanagesystem.pojo.Result;
import com.bookmanage.bookmanagesystem.service.BookManageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class BookManage {
    @Autowired
    public BookManageService bookManageService;
    @Autowired
    public BookRequests bookRequests;


    @GetMapping("/books")
    public Result getAllBooks(@RequestParam(name = "bookName") String bookName,
                              @RequestParam(name = "bookEditer") String bookEditer,
                              @RequestParam("bookType") String bookType,
                              @RequestParam("startIndex") String startIndex,
                              @RequestParam("pageCount") String pageCount) {
        //log.info(bookName);
//      BookRequests bookRequests=new BookRequests();
        bookRequests.setBookNames(bookName);
        bookRequests.setBookEditers(bookEditer);

        if (bookType.equals("null")) {
            bookRequests.setBookTypeid(-1);
        } else {
            bookRequests.setBookTypeid(Integer.valueOf(bookType));
        }
        bookRequests.setStartIndex(Integer.valueOf(startIndex));
        bookRequests.setPageCount(Integer.valueOf(pageCount));
//        log.info("bookName: {}", bookRequests.getBookNames());
//        log.info("bookEditer: {}", bookRequests.getBookEditers());
//        log.info("bookType: {}", bookRequests.getBookTypeid());
        List<Books> o = bookManageService.getAllBooks(bookRequests);
        //if (o != null) log.info(o.iterator().next().toString());
//        if(o!=null){
//            log.info("o不是空的");
//            log.info(o.toString());
//        }
        return Result.success(o);
    }

    @GetMapping("/books/types")//这里的路径名要写全，不要只写一个tp，不然访问的时候会发生错误
    public Result getAllBooksType() {
        return Result.success(bookManageService.getAllBookTypes());
    }

    @GetMapping("/books/counts")
    public Result getCountsOfBooks(){
        return Result.success(bookManageService.getCountsOfBooks());
    }




}
