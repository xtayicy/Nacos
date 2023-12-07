package harry.producer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@RequestMapping("/product/{id}")
	public String getProductName(@PathVariable Long id) {
		
		return "apple" + id;
	}
}
