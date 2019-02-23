package com.bionexo.ubsapi.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class BasicHealthUnitDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5544505702295492473L;

	private Long id;

	private String name;

	private String address;

	private String city;

	private String phone;

	private Double latitude;

	private Double longitude;

	private Integer size;

	private Integer adaptationSeniors;

	private Integer medicalEquipment;

	private Integer medicine;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getAdaptationSeniors() {
		return adaptationSeniors;
	}

	public void setAdaptationSeniors(Integer adaptationSeniors) {
		this.adaptationSeniors = adaptationSeniors;
	}

	public Integer getMedicalEquipment() {
		return medicalEquipment;
	}

	public void setMedicalEquipment(Integer medicalEquipment) {
		this.medicalEquipment = medicalEquipment;
	}

	public Integer getMedicine() {
		return medicine;
	}

	public void setMedicine(Integer medicine) {
		this.medicine = medicine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicHealthUnitDTO other = (BasicHealthUnitDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
