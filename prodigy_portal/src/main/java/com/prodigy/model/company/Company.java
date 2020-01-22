package com.prodigy.model.company;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COMPANY_ID")
	private Integer company_Id;
	
	@Column(name="COMPANY_NAME")
	private String company;

	public void setCompany_Id(Integer company_Id) {
		this.company_Id = company_Id;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getCompany_Id() {
		return company_Id;
	}

	public String getCompany() {
		return company;
	}
	
	
}
