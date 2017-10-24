package com.taskmanager.dao.Impl;

import com.taskmanager.dao.UserDao;
import com.taskmanager.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IUserDao implements UserDao {


    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<User> allUsers() {
        Query query = getSession().createQuery("from User group by username");
        return (List<User>) query.list();
    }

    public void saveOrUpdate(User user) {
        getSession().saveOrUpdate(user);
    }


    public User getUserById(int id) {
        User user = (User) getSession().get(User.class, id);
        return user;
    }

    public void delete(int id) {
        User user = (User)getSession().get(User.class, id);
        getSession().delete(user);
    }
}
