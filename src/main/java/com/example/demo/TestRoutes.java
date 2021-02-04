package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

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

    @GetMapping("/test/{id}")
    @ResponseBody
    private String test(@PathVariable String id, @RequestParam String name) {
        return "test" + id + name;
    }

    @RequestMapping(value = "create-new-user",method = RequestMethod.POST)
    @ResponseBody
    private String createNewUser(@RequestParam("name") String name, @RequestParam("age") String age) {
        return "User created with name: " + name + " and age: " + age;
    }

}
