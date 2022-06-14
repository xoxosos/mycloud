package com.pglin.test.mapper;

import com.pglin.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author LinRenJie
 */
@Mapper
public interface UserMapper {
    /**
     * 得到用户id
     *
     * @param uid uid
     * @return {@link User}
     */
    @Select("select * from db_user where uid = #{uid}")
    User getUserById(int uid);
}
