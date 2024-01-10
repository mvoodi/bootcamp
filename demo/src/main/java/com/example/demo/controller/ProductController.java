package com.example.demo.controller;
import com.example.demo.entites.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductRepository productRepository;
    @GetMapping("/hello")
    public String name(@RequestParam String name){
        return name+" hello!";
    }

    @PostMapping("/register")
    public String register(@RequestParam(required = false) String name){
        Product product = new Product();
        product.setName(name);
        productRepository.save(product);
        return name+ " registered!";
    }

    @GetMapping("/getAll")
    public List<Product> users(){
        return productRepository.findAll();
    }

    @GetMapping("/login")
    public boolean login(@RequestParam String username,@RequestParam int password){
        System.out.println("Entered data: " + username + " " + password);
        return (true);
    }
}
