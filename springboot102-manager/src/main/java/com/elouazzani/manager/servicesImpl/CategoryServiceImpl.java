package com.elouazzani.manager.servicesImpl;

import org.springframework.stereotype.Service;

import com.elouazzani.dao.entities.Category;
import com.elouazzani.manager.dto.CategoryDTO;
import com.elouazzani.manager.services.CategoryService;
import com.elouazzani.manager.transformer.CategoryTransformer;
import com.elouazzani.manager.transformer.Transformer;

@Service
public class CategoryServiceImpl extends GenericServiceImpl<Category, CategoryDTO, Long> implements CategoryService {

	private static Transformer<Category, CategoryDTO> categoryTransformer = new CategoryTransformer();
	
	public CategoryServiceImpl() {
		super(categoryTransformer);
	}

}
