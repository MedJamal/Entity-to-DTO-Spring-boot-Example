package com.elouazzani.manager.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elouazzani.dao.entities.Product;
import com.elouazzani.dao.repositories.ProductRepository;
import com.elouazzani.manager.dto.ProductDTO;
import com.elouazzani.manager.services.ProductService;
import com.elouazzani.manager.transformer.ProductTransformer;
import com.elouazzani.manager.transformer.Transformer;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, ProductDTO, Long> implements ProductService {
	
	private static Transformer<Product, ProductDTO> transformer = new ProductTransformer();

	@Autowired
	ProductRepository productRepository;
	
	public ProductServiceImpl() {
		super(transformer);
	}

	@Override
	public List<ProductDTO> findProductByCategoryName(String name) {
		return transformer.toDTOList(this.productRepository.findProductByCategoryName(name));
	}

}
