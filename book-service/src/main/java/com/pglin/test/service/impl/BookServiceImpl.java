package com.pglin.test.service.impl;

import com.pglin.test.entity.Book;
import com.pglin.test.mapper.BookMapper;
import com.pglin.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LinRenJie
 */
@Service
public class BookServiceImpl implements BookService {
@Autowired
    BookMapper bookMapper;

    @Override
    public Book getBookById(int bid) {
        return bookMapper.getBookById(bid);
    }
}
