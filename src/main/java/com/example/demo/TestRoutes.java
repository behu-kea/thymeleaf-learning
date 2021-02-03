package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestRoutes {
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

    @GetMapping("/test")
    @ResponseBody
    private String test() {
        return "test";
    }

    @GetMapping("/create-new-user")
    @ResponseBody
    private String createNewUserRender() {
        return "<form action=\"/create-new-user\" method=\"POST\">\n" +
                "            <input name=\"name\" placeholder=\"Put in your name\" type=\"text\">\n" +
                "            <input name=\"age\" placeholder=\"Put in your age\" type=\"text\">\n" +
                "            <button>Create new user</button>\n" +
                "        </form>";
    }

    @RequestMapping(value = "create-new-user",method = RequestMethod.POST)
    @ResponseBody
    private String createNewUser(@RequestParam("name") String name, @RequestParam("age") String age) {
        return "User created with name: " + name + " and age: " + age;
    }
}
