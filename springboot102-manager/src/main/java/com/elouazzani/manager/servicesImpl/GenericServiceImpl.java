package com.elouazzani.manager.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.elouazzani.manager.services.GenericService;
import com.elouazzani.manager.transformer.Transformer;

public class GenericServiceImpl<Entity, DTO, Key> implements GenericService<DTO, Key> {
	
	@Autowired
	CrudRepository<Entity, Key> crudRepository;
	
	private Transformer<Entity, DTO> transformer;
	
	public GenericServiceImpl(Transformer<Entity, DTO> transformer) {
		this.transformer = transformer;
	}
	
	@Override
	public long count() {
		return crudRepository.count();
	}

	@Override
	public void delete(DTO dto) {
		crudRepository.delete(transformer.toEntity(dto));
	}

	@Override
	public void deleteAll(Iterable<DTO> dtoList) {
		crudRepository.deleteAll(transformer.toEntityList(dtoList));
	}

	@Override
	public void deleteAll() {
		crudRepository.deleteAll();
	}

	@Override
	public void deleteById(Key id) {
		crudRepository.deleteById(id);
	}

	@Override
	public boolean existsById(Key id) {
		return crudRepository.existsById(id);
	}

	@Override
	public Iterable<DTO> findAll() {
		return transformer.toDTOList(crudRepository.findAll());
	}

	@Override
	public Iterable<DTO> findAllById(Iterable<Key> ids) {
		return transformer.toDTOList(crudRepository.findAllById(ids));
	}

	@Override
	public Optional<DTO> findById(Key id) {
		return Optional.of(transformer.toDTO(crudRepository.findById(id).get()));
	}

	@Override
	public DTO save(DTO dto) {
		return transformer.toDTO(crudRepository.save(transformer.toEntity(dto)));
	}

	@Override
	public Iterable<DTO> saveAll(Iterable<DTO> dtoList) {
		return transformer.toDTOList(crudRepository.saveAll(transformer.toEntityList(dtoList)));
	}

}
