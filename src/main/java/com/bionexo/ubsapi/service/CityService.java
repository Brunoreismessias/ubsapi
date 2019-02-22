package com.bionexo.ubsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bionexo.ubsapi.converter.CityConverter;
import com.bionexo.ubsapi.dto.CityDTO;
import com.bionexo.ubsapi.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private CityConverter converter;
	
	public List<CityDTO> listAll() {
		return converter.convertListEntityToDTO(cityRepository.findAll());
	}
}
