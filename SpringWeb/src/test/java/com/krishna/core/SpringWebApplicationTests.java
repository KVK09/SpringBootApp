package com.krishna.core;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringWebApplicationTests {

	@Test
	void testGetProducts() {
		RestTemplate template = new RestTemplate();
		Products product = template.getForObject("http://localhost:8080/productapi/products/1", Products.class);
		assertNotNull(product);
		assertEquals("Iphone",product.getName());
	}

}
