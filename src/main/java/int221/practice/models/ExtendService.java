package int221.practice.models;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import int221.practice.repositories.ProductsJpaRepository;

@Service
public class ExtendService {
	private ProductsJpaRepository productRepository;

	@Autowired
	public ExtendService(ProductsJpaRepository productsJpaRepository) {

		this.productRepository = productsJpaRepository;
	}

	public void saveImage(MultipartFile file) throws Exception {
		String folder = "/photo/";
		byte[] bytes = file.getBytes();
		Path path = Paths.get(folder, file.getOriginalFilename());
		Files.write(path, bytes);
	}

	public Optional<Product> updateProduct(String id,Product product) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			product.setProductId(id);
			return Optional.of(productRepository.save(product));
		} else 
			return optionalProduct;
		

	}
}
