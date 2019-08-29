package com.elouazzani.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elouazzani.manager.dto.CategoryDTO;
import com.elouazzani.manager.services.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value = {"", "/"})
	public Iterable<CategoryDTO> getAll() {
		return this.categoryService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public CategoryDTO get(@PathVariable Long id) {
		return this.categoryService.findById(id).get();
	}
	
	@PostMapping(value = {"", "/"})
	public CategoryDTO save(@RequestBody CategoryDTO categoryDTO) {
		return this.categoryService.save(categoryDTO);
	}
	
	@PutMapping(value = {"", "/{id}"})
	public CategoryDTO categoryDTO(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO) {
		categoryDTO.setId(id);
		return this.categoryService.save(categoryDTO);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.categoryService.deleteById(id);
	}
	
}






