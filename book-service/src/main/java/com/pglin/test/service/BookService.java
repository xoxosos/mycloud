package com.pglin.test.service;

import com.pglin.test.entity.Book;

/**
 * @author LinRenJie
 */
public interface BookService {
     /**
      * 通过id获取书
      *
      * @param bid 报价
      * @return {@link Book}
      */
     Book getBookById(int bid);
}
