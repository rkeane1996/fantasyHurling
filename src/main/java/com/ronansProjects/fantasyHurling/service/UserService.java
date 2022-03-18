package com.ronansProjects.fantasyHurling.service;

import com.ronansProjects.fantasyHurling.model.Team;
import com.ronansProjects.fantasyHurling.model.User;
import com.ronansProjects.fantasyHurling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(int id) { return userRepository.findById(id); }

    public User saveUser(User user) {
        return userRepository.insert(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

}
