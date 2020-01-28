package com.prodigy.model.empleaves;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LEAVETYPE")
public class LeaveType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LEAVETYPE_ID")
	private int leavetype_id;
	@Column(name="LEAVE_TYPE")
	private String leave_type;
	public int getLeavetype_id() {
		return leavetype_id;
	}
	public String getLeave_type() {
		return leave_type;
	}
	public void setLeavetype_id(int leavetype_id) {
		this.leavetype_id = leavetype_id;
	}
	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}
	@Override
	public String toString() {
		return "LeaveType [leavetype_id=" + leavetype_id + ", leave_type=" + leave_type + "]";
	}
	
	
	
}
