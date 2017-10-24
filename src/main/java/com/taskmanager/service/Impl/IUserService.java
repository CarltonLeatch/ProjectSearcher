package com.taskmanager.service.Impl;

import com.taskmanager.dao.UserDao;
import com.taskmanager.model.User;
import com.taskmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class IUserService implements UserService {
    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public List<User> allUsers() {
        return userDao.allUsers();
    }

    public void saveOrUpdate(User user) {
        userDao.saveOrUpdate(user);
    }


    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public void delete(int id) {
        userDao.delete(id);
    }
}
