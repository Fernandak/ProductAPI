package com.productapi.dto;

import java.util.List;


public record ProductDTO(long id, String title, String description, double price, double discountPercentage,
		double rating, int stock, String brand, String category, String thumbnail, List<String> images

) {


}
