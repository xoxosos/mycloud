package com.pglin.test.service.client;

import com.pglin.test.entity.Book;
import org.springframework.stereotype.Component;

/**
 * @author LinRenJie
 */
@Component
public class BookClientImpl implements BookClient{
    @Override
    public Book getBookById(int bid) {
        return new Book();
    }
}
