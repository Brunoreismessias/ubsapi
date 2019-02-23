package com.bionexo.ubsapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.bionexo.ubsapi.dto.BasicHealthUnitDTO;
import com.bionexo.ubsapi.model.Address;
import com.bionexo.ubsapi.model.BasicHealthUnit;
import com.bionexo.ubsapi.model.Contacts;

@Component
public class BasicHealthUnitConverter {

	public BasicHealthUnitDTO convertEntityToDTO(BasicHealthUnit basicHealthUnit) {

		BasicHealthUnitDTO dto = new BasicHealthUnitDTO();

		BeanUtils.copyProperties(basicHealthUnit, dto);

		dto.setLatitude(basicHealthUnit.getGeoCode().getLatitude());
		dto.setLongitude(basicHealthUnit.getGeoCode().getLongitude());
		dto.setSize(basicHealthUnit.getScores().getSize());
		dto.setAdaptationSeniors(basicHealthUnit.getScores().getAdaptationSeniors());
		dto.setMedicalEquipment(basicHealthUnit.getScores().getMedicalEquipment());
		dto.setMedicine(basicHealthUnit.getScores().getMedicine());

		dto.setAddress(this.formatAddress(basicHealthUnit.getAddress()));
		dto.setPhone(this.formatPhone(basicHealthUnit.getContacts()));

		return dto;
	}

	public List<BasicHealthUnitDTO> convertListEntityToDTO(List<BasicHealthUnit> list) {
		List<BasicHealthUnitDTO> listDTO = new ArrayList<>();

		for (BasicHealthUnit basicHealthUnit : list) {
			listDTO.add(this.convertEntityToDTO(basicHealthUnit));
		}

		return listDTO;

	}

	private String formatPhone(Contacts contacts) {

		StringBuilder builder = new StringBuilder();

		builder.append(contacts.getDdd()).append(" ").append(contacts.getPhone());

		return builder.toString();
	}

	private String formatAddress(Address address) {

		StringBuilder builder = new StringBuilder();

		builder.append(address.getTypeStreet().getShortening()).append(" ").append(address.getDescription())
				.append(", ").append(address.getNumber()).append(" - ").append(address.getDistrict()).append(" - ")
				.append(address.getCity().getDescription()).append(" ")
				.append(address.getCity().getProvince().getShortening());

		return builder.toString();
	}

}
