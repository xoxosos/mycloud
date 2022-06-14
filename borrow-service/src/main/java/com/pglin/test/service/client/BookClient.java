package com.pglin.test.service.client;

import com.pglin.test.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  注意value（可以自定义），fallback指定该方法的补救措施
 * @author LinRenJie
 */
@FeignClient(value = "BookService",fallback = BookClientImpl.class)
public interface BookClient {
    /**
     * 通过id获取书
     *
     * @param bid 报价
     * @return {@link Book}
     */
    @RequestMapping("/book/{bid}")
    Book getBookById(@PathVariable("bid") int bid);
}
