package com.elouazzani.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	
	private Long id;
	private String name;
	private String description;
	private CategoryDTO category;
}
