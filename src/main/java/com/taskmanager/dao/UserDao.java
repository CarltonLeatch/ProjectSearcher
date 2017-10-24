package com.taskmanager.dao;


import com.taskmanager.model.User;

import java.util.List;

public interface UserDao {

    public List<User> allUsers();
    public void saveOrUpdate(User user);
    public User getUserById(int id);
    public void delete(int id);

}
