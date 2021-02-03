package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
        System.out.println(users);
    }

    public List<User> getUsers() {
        return users;
    }

    public String getRenderedUsers() {
        String renderedUsers = "";
        for (User user: users) {
            renderedUsers += "name: " + user.getName() + " age: " + user.getAge() + "<br>";
        }
        return renderedUsers;
    }
}
