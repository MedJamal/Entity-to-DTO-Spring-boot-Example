package com.elouazzani.manager.transformer;

import com.elouazzani.dao.entities.Product;
import com.elouazzani.manager.dto.ProductDTO;

public class ProductTransformer extends Transformer<Product, ProductDTO> {
	
	CategoryTransformer categoryTransformer = new CategoryTransformer();
//	private Transformer<Category, CategoryDTO> categoryTransformer = new CategoryTransformer();

	@Override
	public Product toEntity(ProductDTO productDTO) {
		if(productDTO == null) return null;
		return new Product(productDTO.getId(), productDTO.getName(), productDTO.getDescription(), categoryTransformer.toEntity(productDTO.getCategory()));
	}

	@Override
	public ProductDTO toDTO(Product product) {
		if(product == null) return null;
		return new ProductDTO(product.getId(), product.getName(), product.getDescription(), categoryTransformer.toDTO(product.getCategory()));
	}

}
