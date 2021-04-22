package int221.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import int221.practice.models.Color;

public interface ColorJpaRepository extends JpaRepository<Color, String>{

}
