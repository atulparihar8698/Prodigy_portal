package com.prodigy.model.holidays;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HOLIDAYS")
public class Holiday {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HOLIDAYS_ID")
	private Integer holidays_id;
	
	@Column(name="HOLIDAYS_NAME")
	private String holidays_name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="HOLIDAY_DATE")
	private Date holiday_date;

	public Integer getHolidays_id() {
		return holidays_id;
	}

	public String getHolidays_name() {
		return holidays_name;
	}

	public Date getHoliday_date() {
		return holiday_date;
	}

	public void setHolidays_id(Integer holidays_id) {
		this.holidays_id = holidays_id;
	}

	public void setHolidays_name(String holidays_name) {
		this.holidays_name = holidays_name;
	}

	public void setHoliday_date(Date holiday_date) {
		this.holiday_date = holiday_date;
	}

	@Override
	public String toString() {
		return "Holiday [holidays_id=" + holidays_id + ", holidays_name=" + holidays_name + ", holiday_date="
				+ holiday_date + "]";
	}

	
}
