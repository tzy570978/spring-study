package com.tzy.service;

import com.tzy.dao.UserDao;

/**
 * @author : lipu@csii.com.cn
 * @description :
 * @date 2021/9/21 上午9:46
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
