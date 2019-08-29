package com.elouazzani.dao.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.elouazzani.dao.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	public List<Product> findProductByCategoryName(String name);
	
}
