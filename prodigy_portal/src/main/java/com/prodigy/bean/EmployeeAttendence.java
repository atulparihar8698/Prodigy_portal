package com.prodigy.bean;

import java.util.Date;
import java.util.List;

import com.prodigy.model.attendence.Attendence;

public class EmployeeAttendence {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String password;
	private Date joiningDate;
	private String phone;
	
	private List<Attendence> attendence;

	public String getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public String getPhone() {
		return phone;
	}

	public List<Attendence> getAttendence() {
		return attendence;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAttendence(List<Attendence> attendence) {
		this.attendence = attendence;
	}

	@Override
	public String toString() {
		return "EmployeeAttendence [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", email=" + email + ", password=" + password + ", joiningDate="
				+ joiningDate + ", phone=" + phone + ", attendence=" + attendence + "]";
	}
	
}
