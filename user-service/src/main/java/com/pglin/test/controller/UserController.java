package com.pglin.test.controller;

import com.pglin.test.entity.User;
import com.pglin.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinRenJie
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 得到用户id
     * 这里以restful风格为例子
     * @param uid uid
     * @return {@link User}
     */
    @RequestMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid") int uid) {
        System.out.println("我被调用了！");
        return userService.getUserById(uid);
    }
}
