package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.models.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserRouter {
    private Users users = new Users();

    @RequestMapping(value = "/sign-up", method = RequestMethod.GET)
    @ResponseBody
    public String signUp() {
        return "<form action=\"/sign-up\" method=\"POST\">\n" +
                "            <input name=\"name\" placeholder=\"Put in your name\" type=\"text\">\n" +
                "            <input name=\"age\" placeholder=\"Put in your age\" type=\"text\">\n" +
                "            <button>Create new user</button>\n" +
                "        </form>";
    }

    @RequestMapping(value = "/sign-up-template", method = RequestMethod.GET)
    public String signUpTemplate(Model model) {
        model.addAttribute("attr", "attr");
        return "create-new-user-form";
    }

    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    @ResponseBody
    public String createNewUser(@RequestParam("name") String name, @RequestParam("age") int age) {
        User user = new User(name, age);
        users.addUser(user);
        return "User created with name: " + user.getName() + " and age: " + user.getAge();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getUsers() {
        return users.getRenderedUsers();
    }
}
