package com.bari.springmvc.service;

import com.bari.springmvc.dao.UserDao;
import com.bari.springmvc.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public List<User> listUser() {
        return userDao.listUser();
    }

    @Override
    @Transactional
    public User getUserById(Integer Id) {
        return userDao.getUserById(Id);
    }

    @Override
    @Transactional
    public void removeUser(Integer Id) {
        userDao.removeUser(Id);
    }

    @Override
    @Transactional
    public User loginUsers(User user) {
        return userDao.loginUser(user.getEmail(), user.getPass());
    }
    
}
