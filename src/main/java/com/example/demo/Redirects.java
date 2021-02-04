package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Redirects {
    // Redirect with RedirectView adding query parameters
    @GetMapping("redirect-test")
    public RedirectView redirectView(RedirectAttributes attributes) {
        // adding query parameters to the redirected page
        attributes.addAttribute("name", "Charlotte");
        return new RedirectView("/sign-up");
    }

    // Redirect with prefix redirect
    @GetMapping("redirect-prefix-test-simple")
    public String redirectViewPrefixSimple() {
        // adding query parameters to the redirected page
        return new String("redirect:/sign-up");
    }

    // Redirect with prefix redirect adding query parameters
    @GetMapping("redirect-prefix-test")
    public ModelAndView redirectViewprefix(ModelMap model) {
        // adding query parameters to the redirected page
        model.addAttribute("name", "Charlotte");
        return new ModelAndView("redirect:/sign-up", model);
    }


    // Redirect using forward simple
    @GetMapping("redirect-forward-test-simple")
    public String redirectForwardSimple() {
        // adding query parameters to the redirected page
        return new String("forward:/sign-up");
    }

    // Redirect using forward
    @GetMapping("redirect-forward-test")
    public ModelAndView redirectForward(ModelMap model) {
        // adding query parameters to the redirected page
        model.addAttribute("name", "Charlotte");
        return new ModelAndView("forward:/sign-up", model);
    }
}
