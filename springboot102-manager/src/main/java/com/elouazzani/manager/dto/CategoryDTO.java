package com.elouazzani.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

	private Long id;
	private String name;
//	private List<ProductDTO> products = new ArrayList<>();

}
