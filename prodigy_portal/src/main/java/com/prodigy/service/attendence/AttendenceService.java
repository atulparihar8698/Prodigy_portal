package com.prodigy.service.attendence;

import java.util.List;

import com.prodigy.bean.EmployeeAttendence;
import com.prodigy.model.attendence.Attendence;

public interface AttendenceService {
	public Attendence createAttendence();

	public Attendence updateAttendence(Attendence attendence);

	public void deleteAttendence(String attendenceId);

	public List<EmployeeAttendence> allAttendence();
}
