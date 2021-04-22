package int221.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import int221.practice.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProdPriceBetween(Double lower, Double upper);

}
