package com.productapi.list;

import java.util.List;

import com.productapi.dto.ProductDTO;

import lombok.Data;

@Data
public class ProductList {
	private List<ProductDTO> products;
}
