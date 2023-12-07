package harry.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${service-url.nacos-user-service}")
	private String serviceUrl;
	
	@RequestMapping("/index/{id}")
	public String index(@PathVariable Long id) {
		
		return restTemplate.getForObject(serviceUrl + "/product/" + id, String.class);
	}
}
