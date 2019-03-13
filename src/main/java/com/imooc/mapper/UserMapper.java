package com.imooc.mapper;


import com.imooc.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by tl on 2019/3/3.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User selectById(int id);

}
