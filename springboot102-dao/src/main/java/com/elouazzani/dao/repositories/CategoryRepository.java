package com.elouazzani.dao.repositories;

import org.springframework.data.repository.CrudRepository;

import com.elouazzani.dao.entities.Category;

public interface CategoryRepository  extends CrudRepository<Category, Long>{

}
