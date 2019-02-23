package com.bionexo.ubsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bionexo.ubsapi.converter.BasicHealthUnitConverter;
import com.bionexo.ubsapi.dto.BasicHealthUnitDTO;
import com.bionexo.ubsapi.repository.BasicHealthUnitRepository;

@Service
public class BasicHealthUnitService {

	@Autowired
	private BasicHealthUnitRepository basicHealthUnitRepository;
	
	@Autowired
	private BasicHealthUnitConverter converter;
	
	public List<BasicHealthUnitDTO> listAll() {
		return converter.convertListEntityToDTO(basicHealthUnitRepository.findAll());
	}
}
