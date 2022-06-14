package com.pglin.test.service.client;

import com.pglin.test.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明为userService服务的HTTP请求客户端
 *
 * @author LinRenJie
 * @date 2022/06/14
 */
@FeignClient(value = "UserService",fallback = UserClientImpl.class)
public interface UserClient {
    /**
     * 可直接将controller接口定义取过来
     *
     * @param uid uid
     * @return {@link User}
     */
    @RequestMapping("/user/{uid}")
     User getUserById(@PathVariable("uid") int uid);
}
