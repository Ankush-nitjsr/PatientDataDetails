package com.PatientDataAnkush.PatientDataDetails.service;

import com.PatientDataAnkush.PatientDataDetails.models.User;

import java.util.List;

public interface UserService {
    String createNewUser(User user);

    List<User> getAllUsers();
}
