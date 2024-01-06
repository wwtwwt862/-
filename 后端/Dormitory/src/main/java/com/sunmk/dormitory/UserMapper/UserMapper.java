package com.sunmk.dormitory.UserMapper;

import com.sunmk.dormitory.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * com.sunmk.dormitory.UserMapper
 *
 * @author: wwt
 * @Description TODO
 * @Date 2024/1/5 14:45
 */

@Mapper
public interface UserMapper {
    @Select("select * from sys_user")
    List<User> findAll();
}
