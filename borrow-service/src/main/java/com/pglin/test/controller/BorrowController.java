package com.pglin.test.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pglin.test.entity.BorrowDetail;
import com.pglin.test.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @author LinRenJie
 */
@RestController
public class BorrowController {
 @Autowired
    BorrowService borrowService;

    /**
     * // 可用@HystrixCommand(fallbackMethod = "onError") //指定备选方案
     *
     * @param uid uid
     * @return {@link BorrowDetail}
     */
 @RequestMapping("borrow/{uid}")
  public BorrowDetail getBorrowDetailByUid(@PathVariable("uid") int uid){

     return borrowService.getUserBorrowDetailByUid(uid);
 }

    /*
      挂掉后的备选方案 返回空列表  也可以用openfeign实现

      @param uid uid
     * @return {@link BorrowDetail}
     */
// BorrowDetail onError(int uid) {
//     System.out.println("服务错误，执行备选方案！");
//        return  new BorrowDetail( null, Collections.emptyList());
// }
}
