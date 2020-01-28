package com.prodigy.service.empleaves;

import java.util.List;
import com.prodigy.model.empleaves.LeaveType;

public interface LeaveTypesService {
	
	public LeaveType createLeaveType(LeaveType leaveType);

	public LeaveType updateLeaveType(LeaveType leaveType);

	public void deleteLeaveType(Integer leaveTypeId);

	public List<LeaveType> allLeaveType();

	public LeaveType getLeaveTypeById(String leaveTypeId);
}
