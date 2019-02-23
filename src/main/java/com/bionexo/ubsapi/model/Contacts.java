package com.bionexo.ubsapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contacts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6777012594169305404L;

	@Id
	@SequenceGenerator(name = "contacts_seq", sequenceName = "contacts_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contacts_seq")
	private Long id;

	private String ddd;

	private String phone;

	@OneToOne
	@JoinColumn(name = "basic_health_unit_id")
	private BasicHealthUnit basicHealthUnit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
		Contacts other = (Contacts) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
