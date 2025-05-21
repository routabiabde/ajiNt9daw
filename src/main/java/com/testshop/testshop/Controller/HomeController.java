package com.testshop.testshop.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.testshop.testshop.Model.Entity.Panier;
import com.testshop.testshop.Model.Entity.PanierItem;
import com.testshop.testshop.Model.Entity.Client;
import com.testshop.testshop.Model.Entity.ClothingProduct;
import com.testshop.testshop.Model.Entity.ElectronicProduct;
import com.testshop.testshop.Model.Entity.FoodProduct;
import com.testshop.testshop.Model.Entity.Product;
import com.testshop.testshop.Repository.ClothingProductRepo;
import com.testshop.testshop.Repository.ElectronicProductRepo;
import com.testshop.testshop.Repository.FoodProductRepo;
import com.testshop.testshop.Repository.PanierRepo;
import com.testshop.testshop.Repository.ProductRepo;
import com.testshop.testshop.Repository.clientRepo;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @Autowired
    private FoodProductRepo foodProductRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private PanierRepo panierRepo;

    @Autowired 
    private  clientRepo clientrp;

    @Autowired 
    private ClothingProductRepo clothingProductRepo;

    
    @Autowired
    private ElectronicProductRepo electronicProductRepo;


    // Home Page
    @GetMapping("/home")
    public String homePage(Model model) {
        // Fetch all products from the database
        List<Product> products = productRepo.findAll();

                // Add the products to the model
        model.addAttribute("products", products);
        return "home"; // Corresponds to the Thymeleaf template "home.html"
    }

    @GetMapping("/foodProductPage")
    public String foodProductPage(Model model){

        List<FoodProduct> foodProducts = foodProductRepo.findAll();
        model.addAttribute("products", foodProducts);
        return "foodProductsPage";
    }

    @GetMapping("/electronicProductsPage")
    public String electronicProductPage(Model model) {

        List<ElectronicProduct> electronicProducts = electronicProductRepo.findAll();
        model.addAttribute("products", electronicProducts);
        return  "ElectronicProductsPage";
    }
    
    @GetMapping("/clothingProductsPage")
    public String clothingProductPage(Model model) {
        List<ClothingProduct> clothingProducts = clothingProductRepo.findAll();
        model.addAttribute("products",clothingProducts);
        return  "clothingProductsPage";
    }
    
    // Add Product Page
    @GetMapping("/add-product")
    public String addProductPage() {
        return "addProduct"; // Corresponds to the Thymeleaf template "addProduct.html"
    }

    // Show Products Page
    @GetMapping("/show-products")
    public String showProductsPage(Model model) {
        
       
        List<Product> products = productRepo.findAll();
        System.out.println("Products: " + products);
        model.addAttribute("products", products);
        return "showProducts"; // Corresponds to the Thymeleaf template "showProducts.html"
    }

    @GetMapping("/view")
public String viewPanierItems(Model model) {
    // Retrieve the Panier for the client (hardcoded for now)
    Client client = clientrp.findById(1L)
            .orElseThrow(() -> new RuntimeException("Client not found"));

    Panier panier = panierRepo.findByClient(client)
            .orElseThrow(() -> new RuntimeException("Panier not found"));

     double totalPrice = panier.getItems().stream()
            .mapToDouble(PanierItem::getPrice_total)
            .sum();
    model.addAttribute("totalPrice", totalPrice);


    // Add Panier items to the model
    model.addAttribute("panierItems", panier.getItems());
    return "panier"; // Name of the Thymeleaf template
}


}