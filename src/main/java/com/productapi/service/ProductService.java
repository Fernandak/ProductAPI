package com.productapi.service;

import java.util.List;
import java.util.Optional;

import com.productapi.dto.ProductDTO;

public interface ProductService {

	public Optional<List<ProductDTO>> getProducts();

	public Optional<ProductDTO> getById(Long id);

	public Optional<ProductDTO> addproduct(ProductDTO productDTO);

	public Optional<ProductDTO> updateProduct(Long id, ProductDTO productDTO);

	public Optional<ProductDTO> deleteProduct(Long id);

}
