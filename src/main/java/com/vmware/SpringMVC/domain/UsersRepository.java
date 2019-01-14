package com.vmware.SpringMVC.domain;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis需要你为DAO提供一个接口，它被称之为Mapper，主要是实现具体的SQL语句
 */

// @Mapper 和 @Repository 一样的效果
@Repository
public interface UsersRepository {

    // MyBatis 所需要的 SQL语句
    @Select("select * from users")
    List<Users> selectAll();

    @Select("select * from users where name=#{name}")
    Users getUserByName(String name);

    @Select("select * from users where id=#{id}")
    Users getUserById(int id);
}
