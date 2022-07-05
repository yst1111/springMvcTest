package com.yst.app.service.impl;

import com.yst.app.dao.UserMapper;
import com.yst.app.domain.Student;
import com.yst.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @creator: ly-yangst
 * @date: 2022/7/5
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public Student selectStudentById(String id) {
        return userMapper.selectStudentById(id);
    }
}
