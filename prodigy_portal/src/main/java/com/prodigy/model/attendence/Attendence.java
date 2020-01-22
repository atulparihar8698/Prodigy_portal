package com.prodigy.model.attendence;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATTENDENCE")
public class Attendence {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ATTENDENCE_ID",unique=true)
	private String attendence_id;
	@Column(name = "LOGIN_TIME")
	private Timestamp login_time;
	@Column(name = "LOGOUT_TIME")
	private Timestamp logout_time;
	@Column(name = "EMPLOYEEID")
	private String employeeId;
	public String getAttendence_id() {
		return attendence_id;
	}
	public Timestamp getLogin_time() {
		return login_time;
	}
	public Timestamp getLogout_time() {
		return logout_time;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setAttendence_id(String attendence_id) {
		this.attendence_id = attendence_id;
	}
	public void setLogin_time(Timestamp login_time) {
		this.login_time = login_time;
	}
	public void setLogout_time(Timestamp logout_time) {
		this.logout_time = logout_time;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Attendence [attendence_id=" + attendence_id + ", login_time=" + login_time + ", logout_time="
				+ logout_time + ", employeeId=" + employeeId + "]";
	}
	
}
