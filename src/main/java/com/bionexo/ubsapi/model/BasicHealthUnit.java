package com.bionexo.ubsapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "basic_health_unit")
public class BasicHealthUnit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5379882197892588502L;

	@Id
	@SequenceGenerator(name = "basic_health_unit_seq", sequenceName = "basic_health_unit_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basic_health_unit_seq")
	private Long id;

	private String name;

	private Integer code;

	@OneToOne(mappedBy = "basicHealthUnit")
	private Address address;

	@OneToOne(mappedBy = "basicHealthUnit")
	private Contacts contacts;

	@OneToOne(mappedBy = "basicHealthUnit")
	private GeoCode geoCode;

	@OneToOne(mappedBy = "basicHealthUnit")
	private Scores scores;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	public GeoCode getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(GeoCode geoCode) {
		this.geoCode = geoCode;
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
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
		BasicHealthUnit other = (BasicHealthUnit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
