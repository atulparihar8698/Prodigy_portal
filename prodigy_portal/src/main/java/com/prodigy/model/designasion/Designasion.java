package com.prodigy.model.designasion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DESIGNASION")
public class Designasion {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DESIGNASION_ID")
	private Integer designasionId;
	
	@Column(name="DESIGNASION_NAME")
	private String designasion;
	@Column(name="DESIGNASION_DESCRIPTION")
	private String designasionDescription;
	public Designasion() {
		
	}
	public Integer getDesignasionId() {
		return designasionId;
	}
	public void setDesignasionId(Integer designasionId) {
		this.designasionId = designasionId;
	}
	public String getDesignasion() {
		return designasion;
	}
	public void setDesignasion(String designasion) {
		this.designasion = designasion;
	}
	public String getDesignasionDescription() {
		return designasionDescription;
	}
	public void setDesignasionDescription(String designasionDescription) {
		this.designasionDescription = designasionDescription;
	}
	@Override
	public String toString() {
		return "Designasion [designasionId=" + designasionId + ", designasion=" + designasion
				+ ", designasionDescription=" + designasionDescription + "]";
	}
	

}
