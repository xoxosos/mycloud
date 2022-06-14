package com.pglin.test.service.impl;

import com.pglin.test.entity.Book;
import com.pglin.test.entity.Borrow;
import com.pglin.test.entity.BorrowDetail;
import com.pglin.test.entity.User;
import com.pglin.test.mapper.BorrowMapper;
import com.pglin.test.service.BorrowService;
import com.pglin.test.service.client.BookClient;
import com.pglin.test.service.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {
   @Autowired
    BorrowMapper borrowMapper;
//   @Autowired
//   RestTemplate restTemplate;
   @Resource
    BookClient bookClient;
   @Resource
    UserClient userClient;
    @Override
    public BorrowDetail getUserBorrowDetailByUid(int uid) {
        System.out.println("正常执行方法！");
        List<Borrow> borrows = borrowMapper.getBorrowsByUid(uid);
        //直接使用userClient中的方法代替restTemplate的getForObject方法
        User user = userClient.getUserById(uid);
        //获取每一本书的详情信息
        List<Book> bookList = borrows.stream()
                .map(borrow -> bookClient.getBookById(borrow.getBid()))
                .collect(Collectors.toList());
        return new BorrowDetail(user, bookList);
    }

//    @Override
//    public BorrowDetail getUserBorrowDetailByUid(int uid) {
//        List<Borrow> borrows = borrowMapper.getBorrowsByUid(uid);
//        //通过get for object请求其他服务 将结果自动封装  替换ip Eureka帮我们发现服务 通过配置服务名调用
//        User user = restTemplate.getForObject("http://userService/user/" + uid, User.class);
//        //获取每一本书的详情信息
//        List<Book> bookList = borrows.stream()
//                .map(borrow -> restTemplate.getForObject("http://bookService/book/" + borrow.getBid(), Book.class))
//                .collect(Collectors.toList());
//        return new BorrowDetail(user, bookList);
//    }

}
