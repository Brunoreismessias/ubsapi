package com.bionexo.ubsapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.bionexo.ubsapi.dto.ProvinceDTO;
import com.bionexo.ubsapi.model.Province;

@Component
public class ProvinceConverter {

	public ProvinceDTO convertEntityToDTO(Province province) {
		ProvinceDTO dto = new ProvinceDTO();

		BeanUtils.copyProperties(province, dto);

		return dto;
	}

	public List<ProvinceDTO> convertListEntityToDTO(List<Province> list) {
		List<ProvinceDTO> listDTO = new ArrayList<>();

		for (Province province : list) {
			listDTO.add(this.convertEntityToDTO(province));
		}

		return listDTO;

	}
}
