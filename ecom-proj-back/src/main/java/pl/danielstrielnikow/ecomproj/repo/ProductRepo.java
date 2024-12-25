package pl.danielstrielnikow.ecomproj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.danielstrielnikow.ecomproj.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
