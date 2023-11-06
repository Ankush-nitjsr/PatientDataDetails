package com.PatientDataAnkush.PatientDataDetails.service;

import com.PatientDataAnkush.PatientDataDetails.models.User;

import java.util.List;

public interface UserService {
    public String createNewUser(User user);

    public List<User> getAllUsers();
}
