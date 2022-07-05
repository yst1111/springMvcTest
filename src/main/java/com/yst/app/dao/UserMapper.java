package com.yst.app.dao;

import com.yst.app.domain.Student;
import org.apache.ibatis.annotations.Select;

/**
 * @creator: ly-yangst
 * @date: 2022/7/5
 */
public interface UserMapper {

    @Select("select * from student where id = #{id}")
    Student selectStudentById(String id);
}
