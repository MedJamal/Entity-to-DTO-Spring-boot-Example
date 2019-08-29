package com.elouazzani.manager.transformer;

import com.elouazzani.dao.entities.Category;
import com.elouazzani.manager.dto.CategoryDTO;

public class CategoryTransformer extends Transformer<Category, CategoryDTO>{

//	ProductTransformer productTransformer = new ProductTransformer();
//	private Transformer<Product, ProductDTO> productTransformer = new ProductTransformer();
	
	@Override
	public Category toEntity(CategoryDTO categoryDTO) {
		
		if(categoryDTO == null) return null;
		
		Category category = new Category();
		category.setId(categoryDTO.getId());
		category.setName(categoryDTO.getName());
		
		return category;
	}

	@Override
	public CategoryDTO toDTO(Category category) {
		
		if(category == null) return null;
		
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(category.getId());
		categoryDTO.setName(category.getName());
		
		return categoryDTO;
	}

}
