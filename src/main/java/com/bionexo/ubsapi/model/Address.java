package com.bionexo.ubsapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3406730251391133022L;

	@Id
	@SequenceGenerator(name = "address_seq", sequenceName = "address_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
	private Long id;

	private String description;

	private String number;

	private String district;

	private String complement;

	@Column(name = "zip_code")
	private String zipCode;

	@OneToOne
	@JoinColumn(name = "type_street_id")
	private TypeStreet typeStreet;

	@OneToOne
	@JoinColumn(name = "basic_health_unit_id")
	private BasicHealthUnit basicHealthUnit;

	@OneToOne
	@JoinColumn(name = "city_id")
	private City city;

	@OneToOne
	@JoinColumn(name = "province_id")
	private Province province;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TypeStreet getTypeStreet() {
		return typeStreet;
	}

	public void setTypeStreet(TypeStreet typeStreet) {
		this.typeStreet = typeStreet;
	}

	public BasicHealthUnit getBasicHealthUnit() {
		return basicHealthUnit;
	}

	public void setBasicHealthUnit(BasicHealthUnit basicHealthUnit) {
		this.basicHealthUnit = basicHealthUnit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
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
		Address other = (Address) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
