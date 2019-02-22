package com.bionexo.ubsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bionexo.ubsapi.converter.TypeStreetConverter;
import com.bionexo.ubsapi.dto.TypeStreetDTO;
import com.bionexo.ubsapi.repository.TypeStreetRepository;

@Service
public class TypeStreetService {

	@Autowired
	private TypeStreetRepository typeStreetRepository;
	
	@Autowired
	private TypeStreetConverter converter;
	
	public List<TypeStreetDTO> listAll() {
		return converter.convertListEntityToDTO(typeStreetRepository.findAll());
	}
}
