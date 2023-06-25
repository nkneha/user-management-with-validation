package com.example.UserManagement.service;

import com.example.UserManagement.model.User;
import com.example.UserManagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.getUsers();
    }

    public String createUser(List<User> users) {
        List<User> origionalList = getAllUsers();
        origionalList.addAll(users);
        return "new users added!!!";
    }

    public String createSingleUser(User user) {
        List<User> origionalList = getAllUsers();
        origionalList.add(user);
        return "new single user added";
    }

    public User userById(String id) {
        List<User> origionalList = getAllUsers();
        for(User i:origionalList){
            if(id.equals(i.getUserId())){
                return i;
            }
        }
        throw new IllegalStateException("id not found");
    }

    public String removeUser(String id) {
        List<User> origionalList = getAllUsers();
        for(User i:origionalList){
            if(i.getUserId().equals(id)){
                origionalList.remove(i);
                return "id got deleted";

            }
        }
        return "id not deleted";
    }

    public String updateUser(String id, String emailId) {
        List<User> origionalList = getAllUsers();
        for(User u:origionalList){
            if(u.getUserId().equals(id)){
                u.setEmailId(emailId);
                return "updated!!!";
            }
        }
        return "id not found to update";
    }
}
