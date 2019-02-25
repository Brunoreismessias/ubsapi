package com.bionexo.ubsapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.bionexo.ubsapi.calculation.Haversine;
import com.bionexo.ubsapi.converter.BasicHealthUnitConverter;
import com.bionexo.ubsapi.dto.BasicHealthUnitDTO;
import com.bionexo.ubsapi.dto.OriginDTO;
import com.bionexo.ubsapi.model.BasicHealthUnit;
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

	public List<BasicHealthUnitDTO> findUnitNear(Double latitude, Double longitude, Double distance) {

		OriginDTO origin = new OriginDTO();

		origin.setDistance(distance);
		origin.setLatitude(latitude);
		origin.setLongitude(longitude);

		List<BasicHealthUnitDTO> listUnitNear = new ArrayList<>();

		for (BasicHealthUnit basicHealthUnit : basicHealthUnitRepository.findAll()) {
			if (Haversine.calculate(origin, basicHealthUnit.getGeoCode()) <= origin.getDistance()) {
				listUnitNear.add(converter.convertEntityToDTO(basicHealthUnit));
			}
		}
		return listUnitNear;
	}
}
