package com.pglin.test.controller;

import com.pglin.test.entity.Book;
import com.pglin.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinRenJie
 */
@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping("/book/{bid}")
    public Book getBookById(@PathVariable("bid") int bid){
        return bookService.getBookById(bid);
    }
}
