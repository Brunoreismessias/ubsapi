package com.bionexo.ubsapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bionexo.ubsapi.dto.CityDTO;
import com.bionexo.ubsapi.dto.ProvinceDTO;
import com.bionexo.ubsapi.model.City;

@Component
public class CityConverter {

	@Autowired
	private ProvinceConverter provinceConverter;

	public CityDTO convertEntityToDTO(City city) {
		ProvinceDTO provinceDTO = provinceConverter.convertEntityToDTO(city.getProvince());

		CityDTO cityDTO = new CityDTO();
		BeanUtils.copyProperties(city, cityDTO);

		cityDTO.setProvinceDTO(provinceDTO);

		return cityDTO;
	}

	public List<CityDTO> convertListEntityToDTO(List<City> list) {
		List<CityDTO> listDTO = new ArrayList<>();

		for (City city : list) {
			listDTO.add(this.convertEntityToDTO(city));
		}

		return listDTO;

	}
}
