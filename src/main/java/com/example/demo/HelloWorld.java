package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorld {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    String home() {
        return "Hello World! This is a tests";
    }

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    @ResponseBody
    public String main() {
        return "hello world";
    }

    @GetMapping("/users")
    @ResponseBody
    public String test() {
        return "test";
    }

    @GetMapping("/create-new-user")
    @ResponseBody
    public String createNewUserRender() {
        return "<form action=\"/create-new-user\" method=\"POST\">\n" +
                "            <input name=\"name\" placeholder=\"Put in your name\" type=\"text\">\n" +
                "            <input name=\"age\" placeholder=\"Put in your age\" type=\"text\">\n" +
                "            <button>Create new user</button>\n" +
                "        </form>";
    }

    @RequestMapping(value = "create-new-user",method = RequestMethod.POST)
    @ResponseBody
    public String createNewUser(@RequestParam("name") String name, @RequestParam("age") String age) {
        return "User created with name: " + name + " and age: " + age;
    }
}
