package com.yst.app.service;

import com.yst.app.domain.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * @creator: ly-yangst
 * @date: 2022/7/5
 */
public interface UserService {

    Student selectStudentById(String id);
}
