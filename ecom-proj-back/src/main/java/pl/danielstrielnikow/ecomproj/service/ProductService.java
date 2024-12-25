package pl.danielstrielnikow.ecomproj.service;

import org.springframework.stereotype.Service;
import pl.danielstrielnikow.ecomproj.model.Product;
import pl.danielstrielnikow.ecomproj.repo.ProductRepo;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo repo;

    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
