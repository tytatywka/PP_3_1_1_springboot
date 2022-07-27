package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;
import net.proselyte.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements UserServiceInt{

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional(readOnly = true)
    public User findById(Long id){
        return userRepository.getOne(id);
    }
    @Transactional(readOnly = true)
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @Transactional
    public User saveUser(User user){
        return userRepository.save(user);
    }
    @Transactional
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
