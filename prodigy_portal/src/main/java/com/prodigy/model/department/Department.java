package com.prodigy.model.department;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DEPARTMENT")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DEPARTMENT_ID")
	private Integer department_Id;
	
	@Column(name="DEPARTMENT")
	private String department;

	public void setDepartment_Id(Integer department_Id) {
		this.department_Id = department_Id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getDepartment_Id() {
		return department_Id;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Department [department_Id=" + department_Id + ", department=" + department + "]";
	}
	
	
	
}
