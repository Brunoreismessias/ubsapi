package com.bionexo.ubsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.bionexo.ubsapi.converter.TypeStreetConverter;
import com.bionexo.ubsapi.dto.CityDTO;
import com.bionexo.ubsapi.dto.TypeStreetDTO;
import com.bionexo.ubsapi.repository.TypeStreetRepository;

import io.swagger.annotations.ApiOperation;

@Service
public class TypeStreetService {

	@Autowired
	private TypeStreetRepository typeStreetRepository;
	
	@Autowired
	private TypeStreetConverter converter;
	
	@ApiOperation(value="Returns a list with all type street", response=TypeStreetDTO.class)
	@GetMapping
	public List<TypeStreetDTO> listAll() {
		return converter.convertListEntityToDTO(typeStreetRepository.findAll());
	}
}
