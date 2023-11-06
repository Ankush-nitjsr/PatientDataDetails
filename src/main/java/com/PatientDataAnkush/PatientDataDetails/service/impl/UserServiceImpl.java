package com.PatientDataAnkush.PatientDataDetails.service.impl;

import com.PatientDataAnkush.PatientDataDetails.models.User;
import com.PatientDataAnkush.PatientDataDetails.repository.UserRepository;
import com.PatientDataAnkush.PatientDataDetails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public String createNewUser(User user) {
        userRepository.save(user);
        return "New user registered successfully";
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
