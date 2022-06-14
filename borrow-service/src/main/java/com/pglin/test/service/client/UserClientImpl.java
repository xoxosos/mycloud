package com.pglin.test.service.client;

import com.pglin.test.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author LinRenJie
 */
@Component
public class UserClientImpl implements UserClient{
    @Override
    public User getUserById(int uid) {
        User user = new User();
        user.setName("补救方法！");
        return user;
    }
}
