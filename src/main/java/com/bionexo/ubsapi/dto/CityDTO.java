package com.bionexo.ubsapi.dto;

import java.io.Serializable;

public class CityDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4173289888774355165L;

	private Long id;

	private String description;

	private ProvinceDTO provinceDTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProvinceDTO getProvinceDTO() {
		return provinceDTO;
	}

	public void setProvinceDTO(ProvinceDTO provinceDTO) {
		this.provinceDTO = provinceDTO;
	}
}
