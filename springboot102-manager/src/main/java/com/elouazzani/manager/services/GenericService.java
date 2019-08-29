package com.elouazzani.manager.services;

import java.util.Optional;

public interface GenericService <DTO,Key>{
	long count();
	void delete(DTO dto);
	void deleteAll(Iterable<DTO> dtoList); 
	void deleteAll();
	void deleteById(Key id);
	boolean existsById(Key id); 
	Iterable<DTO> findAll(); 
	Iterable<DTO> findAllById(Iterable<Key> ids); 
	Optional<DTO> findById(Key id); 
	DTO save(DTO dto);
	Iterable<DTO> saveAll(Iterable<DTO> dtoList);
}
