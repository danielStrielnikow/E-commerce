package pl.danielstrielnikow.ecomproj.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.danielstrielnikow.ecomproj.model.Product;
import pl.danielstrielnikow.ecomproj.service.ProductService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping("/home")
    public String greet() {
        return "Hello World";
    }


    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }
}
