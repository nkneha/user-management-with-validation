package com.example.UserManagement.controller;

import com.example.UserManagement.model.User;
import com.example.UserManagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("users")      // get all the users
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("Users")   // create users list
    String addUserList( @RequestBody @Valid List<User> users){
        return userService.createUser(users);
    }
    @PostMapping("user")   //adding single user
    String addUser(@RequestBody @Valid User user){
        return userService.createSingleUser(user);
    }

    @GetMapping("user/id/{userId}")
    User getUserById(@PathVariable String userId){
        return userService.userById(userId);
    }

    @DeleteMapping("user/remove")
    String deleteUser(@RequestParam String userId){
        return userService.removeUser(userId);
    }
    @PutMapping("user/update/emailId")
    String updateUser(@RequestParam String id,@RequestParam String emailId){
        return userService.updateUser(id,emailId);
    }

}
