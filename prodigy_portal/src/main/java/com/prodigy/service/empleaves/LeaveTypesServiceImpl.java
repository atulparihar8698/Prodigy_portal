package com.prodigy.service.empleaves;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodigy.model.empleaves.EmpLeaves;
import com.prodigy.model.empleaves.LeaveType;
import com.prodigy.repository.empleaves.LeaveTypeRepository;

@Service
public class LeaveTypesServiceImpl implements LeaveTypesService{
	@Autowired
	private LeaveTypeRepository leaveTypeRepository;

	@Override
	@Transactional
	public LeaveType createLeaveType(LeaveType leaveType) {
		return leaveTypeRepository.save(leaveType);
	}

	@Override
	@Transactional
	public LeaveType updateLeaveType(LeaveType leaveType) {
		return leaveTypeRepository.save(leaveType);
	}

	@Override
	@Transactional
	public void deleteLeaveType(Integer leaveTypeId) {
		leaveTypeRepository.delete(leaveTypeId);
	}

	@Override
	@Transactional
	public List<LeaveType> allLeaveType() {
		return leaveTypeRepository.findAll();
	}

	@Override
	public LeaveType getLeaveTypeById(String leaveTypeId) {
		
		return null;
	}
}
