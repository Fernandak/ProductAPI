package com.productapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapi.dto.ProductDTO;
import com.productapi.feignclients.ProductFeignClient;
import com.productapi.list.ProductList;
import com.productapi.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductFeignClient productFeignClient;

	@Override
	public Optional<List<ProductDTO>> getProducts() {
		log.info("Call ProductServiceImpl.getProducts ");

		ProductList list = productFeignClient.getProducts();

		List<ProductDTO> productList = list.getProducts();

		Optional<List<ProductDTO>> product = Optional.of(productList);

		return product;
	}

	@Override
	public Optional<ProductDTO> getById(Long id) {
		log.info("Call ProductServiceImpl.getById ");

		ProductDTO product = productFeignClient.getById(id);
		//product.orElseThrow(RuntimeException::new);

		return Optional.of(product);
	}

	@Override
	public Optional<ProductDTO> addproduct(ProductDTO productDTO) {
		log.info("Call ProductServiceImpl.addproduct ");

		ProductDTO product = productFeignClient.addProduct(productDTO);

		return Optional.of(product);
	}

	@Override
	public Optional<ProductDTO> updateProduct(Long id, ProductDTO productDTO) {
		log.info("Call ProductServiceImpl.updateProduct ");

		ProductDTO product = productFeignClient.updateProduct(id);

		return Optional.of(product);
	}

	@Override
	public Optional<ProductDTO> deleteProduct(Long id) {
		log.info("Call ProductServiceImpl.deleteProduct ");

		ProductDTO product = productFeignClient.deleteProduct(id);

		return Optional.of(product);
	}

}
