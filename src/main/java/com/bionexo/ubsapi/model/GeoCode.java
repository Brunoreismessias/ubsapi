package com.bionexo.ubsapi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "geo_code")
public class GeoCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5732566922851071538L;

	@Id
	@SequenceGenerator(name = "geo_code_seq", sequenceName = "geo_code_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geo_code_seq")
	private Long id;

	private BigDecimal latitude;

	private BigDecimal longitude;

	@OneToOne
	@JoinColumn(name = "basic_health_unit_id")
	private BasicHealthUnit basicHealthUnit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BasicHealthUnit getBasicHealthUnit() {
		return basicHealthUnit;
	}

	public void setBasicHealthUnit(BasicHealthUnit basicHealthUnit) {
		this.basicHealthUnit = basicHealthUnit;
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
		GeoCode other = (GeoCode) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
