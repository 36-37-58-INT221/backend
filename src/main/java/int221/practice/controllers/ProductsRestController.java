package int221.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import groovyjarjarpicocli.CommandLine.Model;
import int221.practice.models.Brand;
import int221.practice.models.Color;
import int221.practice.models.Product;
import int221.practice.repositories.BrandJpaRepository;
import int221.practice.repositories.ColorJpaRepository;
import int221.practice.repositories.ProductsJpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductsRestController {
	@Autowired
	ProductsJpaRepository productsJpaRepository;
	ColorJpaRepository colorJpaRepository;
	BrandJpaRepository brandJpaRepository;

//	@GetMapping("/products/{code}")
//	public Product show(@PathVariable String code) {
//
//		return productsJpaRepository.findById(code).orElse(null);
//	}
//
//	@GetMapping("/products")
//	public List<Product> allProducts() {
//		return productsJpaRepository.findAll();
//	}

	@RequestMapping // รับrequestทุกชนิด
	public String request() {
		
		return;
	};

	@GetMapping("/color/{colorId}") // รับแบบget
	public Color getColor(@PathVariable String colorId) {
		return colorJpaRepository.findById(colorId).orElse(null);
	};
	
	@GetMapping("/brand/{brandId}") // รับแบบget
	public Brand getBrand(@PathVariable String brandId) {
		return brandJpaRepository.findById(brandId).orElse(null);
	};

	@PostMapping("/form") // รับแบบPost
	public String post(Product product ) {
		productsJpaRepository.save(product);
		return product.getProductId();
	};

	@PutMapping() // รับแบบPut
	public String put() {

		return;
	};

	@DeleteMapping("/products/{id}") // รับแบบDelete
	public void delete(@PathVariable String id) {
		for (int i = 0; i < productsJpaRepository.findAll().size(); i++) {
			if (productsJpaRepository.findById(id).equals(id)) {
				productsJpaRepository.deleteById(id);
				break;
			}
		}
	};

}
