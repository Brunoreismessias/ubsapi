package com.bionexo.ubsapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bionexo.ubsapi.dto.TypeStreetDTO;
import com.bionexo.ubsapi.model.TypeStreet;

@Component
public class TypeStreetConverter {

	public TypeStreetDTO convertEntityToDTO(TypeStreet typeStreet) {
		TypeStreetDTO dto = new TypeStreetDTO();

		dto.setId(typeStreet.getId());
		dto.setShortening(typeStreet.getShortening());
		dto.setDescription(typeStreet.getDescription());

		return dto;
	}

	public List<TypeStreetDTO> convertListEntityToDTO(List<TypeStreet> list) {
		List<TypeStreetDTO> listDTO = new ArrayList<>();

		for (TypeStreet typeStreet : list) {
			listDTO.add(this.convertEntityToDTO(typeStreet));
		}

		return listDTO;

	}
}
