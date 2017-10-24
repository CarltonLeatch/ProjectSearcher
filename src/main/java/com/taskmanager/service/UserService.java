package com.taskmanager.service;

import com.taskmanager.model.User;

import java.util.List;

public interface UserService {
    public List<User> allUsers();
    public void saveOrUpdate(User user);
    public User getUserById(int id);
    public void delete(int id);
}
