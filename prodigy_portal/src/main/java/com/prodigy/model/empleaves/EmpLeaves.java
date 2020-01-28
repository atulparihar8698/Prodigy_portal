package com.prodigy.model.empleaves;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEAVES")
public class EmpLeaves {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LEAVE_ID")
	private int leave_id;
	@Column(name="LEAVE_TYPE")
	private int leave_type;
	@Column(name="LEAVE_FROM")
	private	Timestamp leave_from;
	@Column(name="LEAVE_TO")
	private Timestamp leave_to;
	@Column(name="NO_DAYS")
	private int no_days;
	@Column(name="REASON")
	private	String reason;
	@Column(name="STATUS")
	private char status;
	@Column(name="EMPLOYEE_ID")
	private String employee_id;
	public int getLeave_id() {
		return leave_id;
	}
	public int getLeave_type() {
		return leave_type;
	}
	public Timestamp getLeave_from() {
		return leave_from;
	}
	public Timestamp getLeave_to() {
		return leave_to;
	}
	public int getNo_days() {
		return no_days;
	}
	public String getReason() {
		return reason;
	}
	public char getStatus() {
		return status;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}
	public void setLeave_type(int leave_type) {
		this.leave_type = leave_type;
	}
	public void setLeave_from(Timestamp leave_from) {
		this.leave_from = leave_from;
	}
	public void setLeave_to(Timestamp leave_to) {
		this.leave_to = leave_to;
	}
	public void setNo_days(int no_days) {
		this.no_days = no_days;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	@Override
	public String toString() {
		return "EmpLeaves [leave_id=" + leave_id + ", leave_type=" + leave_type + ", leave_from=" + leave_from
				+ ", leave_to=" + leave_to + ", no_days=" + no_days + ", reason=" + reason + ", status=" + status
				+ ", employee_id=" + employee_id + "]";
	}
	
	
}
