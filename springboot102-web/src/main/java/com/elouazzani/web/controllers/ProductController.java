package com.elouazzani.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elouazzani.manager.dto.ProductDTO;
import com.elouazzani.manager.services.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value = {"", "/"})
	public Iterable<ProductDTO> getAll(){
		return this.productService.findAll();
	}
	
	@GetMapping(value = {"/{id}"})
	public ProductDTO getById(@PathVariable Long id) {
		return this.productService.findById(id).get();
	}
	
	@PostMapping(value = {"", "/"})
	public ProductDTO save(@RequestBody ProductDTO produDto) {
		return this.productService.save(produDto);
	}
	
	@PutMapping(value = "/{id}")
	public ProductDTO update(@RequestBody ProductDTO productDTO, @PathVariable Long id) {
		productDTO.setId(id);
		return this.productService.save(productDTO);
	}
	
	@DeleteMapping(value = {"", "/{id}"})
	public void delete(@PathVariable Long id) {
		this.productService.deleteById(id);
	}
	
	@GetMapping("/find/{name}")
	public List<ProductDTO> getByCategoryName(@PathVariable String name){
		System.out.println("here");
		return this.productService.findProductByCategoryName(name);
	}
	
}






