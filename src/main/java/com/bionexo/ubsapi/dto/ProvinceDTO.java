package com.bionexo.ubsapi.dto;

import java.io.Serializable;

public class ProvinceDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5776970122632800387L;

	private Long id;

	private String description;

	private String shortening;

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

	public String getShortening() {
		return shortening;
	}

	public void setShortening(String shortening) {
		this.shortening = shortening;
	}
}
