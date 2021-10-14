package com.example.m2mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products")
    public String findAll(Model model){
        List<Product> products = repository.findAll();
model.addAttribute("cosa", products);
        return "product-list";
    }

    @GetMapping("/products/data")
    public String data(){
        Product producto1 = new Product(null, "Producto 1", 49.99);
        Product producto2 = new Product(null, "Producto 2", 49.99);
        Product producto3 = new Product(null, "Producto 3", 49.99);
        Product producto4 = new Product(null, "Producto 4", 49.99);

        repository.save(producto1);
        repository.save(producto2);
        repository.save(producto3);
        repository.save(producto4);
        return "redirect:/products";
    }

}
