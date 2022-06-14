package com.pglin.test.mapper;

import com.pglin.test.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author LinRenJie
 */
@Mapper
public interface BookMapper {
    /**
     * 通过id获取书
     *
     * @param bid 报价
     * @return {@link Book}
     */
    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(int bid);
}
