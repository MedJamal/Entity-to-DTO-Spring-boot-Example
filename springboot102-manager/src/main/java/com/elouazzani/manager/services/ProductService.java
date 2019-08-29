package com.elouazzani.manager.services;

import java.util.List;

import com.elouazzani.manager.dto.ProductDTO;

public interface ProductService extends GenericService<ProductDTO, Long>{
	List<ProductDTO> findProductByCategoryName(String name);
}
