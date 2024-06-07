package com.productapi.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.productapi.dto.ProductDTO;
import com.productapi.list.ProductList;

@Component
@FeignClient(value = "productapi", url = "https://dummyjson.com/")
public interface ProductFeignClient {

	@GetMapping(value = "/products")
	ProductList getProducts();

	@GetMapping(value = "/products/{id}")
	ProductDTO getById(@PathVariable("id") Long id);

	@PostMapping(value = "/products/add")
	ProductDTO addProduct(ProductDTO productDTO);

	@PutMapping(value = "/products/{id}")
	ProductDTO updateProduct(@PathVariable("id") Long id);

	@DeleteMapping(value = "/products/{id}")
	ProductDTO deleteProduct(@PathVariable("id") Long id);

}
