package int221.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import int221.practice.models.Brand;
import int221.practice.models.Product;

public interface ProductsJpaRepository extends JpaRepository<Product, String> {
}
