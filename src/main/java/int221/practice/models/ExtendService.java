package int221.practice.models;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.springframework.web.multipart.MultipartFile;

public class ExtendService {
	public void saveImage(MultipartFile file) throws Exception{
		String folder = "/photo/";
		byte[] bytes = file.getBytes();
		Path path = Paths.get(folder, file.getOriginalFilename());
		Files.write(path, bytes);
	}
}
