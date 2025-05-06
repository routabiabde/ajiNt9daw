package com.testshop.testshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.testshop.testshop.Repository.ProductRepo;

@Controller
public class HomeController {

    @Autowired
    private ProductRepo productRepo;

    // Home Page
    @GetMapping("/")
    public String homePage() {
        return "home"; // Corresponds to the Thymeleaf template "home.html"
    }

    // Add Product Page
    @GetMapping("/add-product")
    public String addProductPage() {
        return "addProduct"; // Corresponds to the Thymeleaf template "addProduct.html"
    }

    // Show Products Page
    @GetMapping("/show-products")
    public String showProductsPage(Model model) {
        model.addAttribute("products", productRepo.findAll());
        return "showProducts"; // Corresponds to the Thymeleaf template "showProducts.html"
    }
}