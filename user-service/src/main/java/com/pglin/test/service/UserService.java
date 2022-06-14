package com.pglin.test.service;

import com.pglin.test.entity.User;

/**
 * @author LinRenJie
 */
public interface UserService {
        /**
         * 得到用户id
         *
         * @param uid uid
         * @return {@link User}
         */
        User getUserById(int uid);
}
