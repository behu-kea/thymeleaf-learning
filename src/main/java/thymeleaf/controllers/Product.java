package thymeleaf.controllers;

import com.example.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class Product {

    // using a simple template
    @GetMapping("product")
    private String product() {
        return "products/product";
    }



    // using variable
    @GetMapping("product-variables")
    private String product(Model model) {
        thymeleaf.models.Product tv = new thymeleaf.models.Product("tv", 3000);
        thymeleaf.models.Product mobile = new thymeleaf.models.Product("mobile", 7000);

        ArrayList<thymeleaf.models.Product> products = new ArrayList<thymeleaf.models.Product>();

        products.add(tv);
        products.add(mobile);

        model.addAttribute("pageTitle", "Buy awesome products");
        model.addAttribute("loggedIn", false);
        model.addAttribute("products", products);
        return "products/product-variables";
    }
}
