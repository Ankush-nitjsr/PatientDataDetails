package com.PatientDataAnkush.PatientDataDetails.controllers;

import com.PatientDataAnkush.PatientDataDetails.models.User;
import com.PatientDataAnkush.PatientDataDetails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // create user
    @PostMapping("/add-user")
    public String registerNewUser(@RequestBody User user) {
        return userService.createNewUser(user);
    }

    // Get all users
    @GetMapping("/get-all-users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get-current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}
