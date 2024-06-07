package com.productapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.productapi.dto.ProductDTO;
import com.productapi.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	/*
	 * Busca por Id
	 */
	@GetMapping("/{id}")
	public ResponseEntity<ProductDTO> getById(@PathVariable Long id) {
		log.info("Call ProductController.getbyid ");

		return productService.getById(id).map(res -> ResponseEntity.ok(res)).orElse(ResponseEntity.notFound().build());
	}

	/*
	 * Lista todos os produtos
	 */
	@GetMapping
	public ResponseEntity<List<ProductDTO>> getProducts() {
		log.info("Call ProductController.getProducts ");

		return ResponseEntity.ok(productService.getProducts().get());
	}

	/*
	 * Adiciona novos produtos
	 */
	@PostMapping(value = "/add")
	public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
		log.info("Call ProductController.addProducts ");

		Optional<ProductDTO> product = productService.addproduct(productDTO);

		return ResponseEntity.ok(product.get());
	}

	/*
	 * Atualiza produtos
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long id, @RequestBody ProductDTO productDTO) {
		log.info("Call ProductController.updateProduct ");

		Optional<ProductDTO> product = productService.updateProduct(id, productDTO);

		return ResponseEntity.ok(product.get());
	}

	/*
	 * Deleta produtos
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> deleteProduct(@PathVariable Long id) {
		log.info("Call ProductController.deleteProduct ");
		Optional<ProductDTO> product = productService.deleteProduct(id);

		return ResponseEntity.ok(product.get());
	}

}
