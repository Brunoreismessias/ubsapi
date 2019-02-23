package com.bionexo.ubsapi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "scores")
public class Scores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3794110010838995112L;

	@Id
	@SequenceGenerator(name = "scores_seq", sequenceName = "scores_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scores_seq")
	private Long id;

	@Min(1)
	@Max(3)
	private Integer size;

	@Min(1)
	@Max(3)
	@Column(name = "adaptation_for_seniors")
	private Integer adaptationSeniors;

	@Min(1)
	@Max(3)
	@Column(name = "medical_equipment")
	private Integer medicalEquipment;

	@Min(1)
	@Max(3)
	private Integer medicine;

	@OneToOne
	@JoinColumn(name = "basic_health_unit_id")
	private BasicHealthUnit basicHealthUnit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		Scores other = (Scores) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
