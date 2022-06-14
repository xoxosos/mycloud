package com.pglin.test.service.serviceimpl;

import com.pglin.test.entity.User;
import com.pglin.test.mapper.UserMapper;
import com.pglin.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LinRenJie
 */
@Service
public class UserServiceImpl implements UserService {
@Autowired
    UserMapper userMapper;
    @Override
    public User getUserById(int uid) {
        return userMapper.getUserById(uid);
    }
}
