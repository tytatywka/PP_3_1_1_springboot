package net.proselyte.springbootdemo.service;


import net.proselyte.springbootdemo.model.User;

import java.util.List;

public interface UserServiceInt {
    public User findById(Long id);
    public List<User> findAll();
    public User saveUser(User user);
    public void deleteById(Long id);
}
