package com.example.demo.models;

import java.util.List;

public class Users {
    private List<User> users;


    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
