package int221.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import int221.practice.models.Brand;

public interface BrandJpaRepository extends JpaRepository<Brand, String>  {

}
