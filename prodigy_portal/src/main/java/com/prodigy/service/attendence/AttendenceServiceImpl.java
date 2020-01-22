package com.prodigy.service.attendence;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodigy.bean.EmployeeAttendence;
import com.prodigy.model.attendence.Attendence;
import com.prodigy.model.employee.Employee;
import com.prodigy.repository.attendence.AttendenceRepository;
import com.prodigy.repository.employee.EmployeeRepostory;
import com.prodigy.service.employee.EmployeeService;
@Service
public class AttendenceServiceImpl implements AttendenceService{
	@Autowired
	private AttendenceRepository attendenceRepository;

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	@Transactional
	public Attendence createAttendence() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Attendence attendence=new Attendence();
		attendence.setLogin_time(timestamp);
		attendence.setEmployeeId("PGI-1");
		return attendenceRepository.save(attendence);
	}

	@Override
	@Transactional
	public Attendence updateAttendence(Attendence attendence) {
		return attendenceRepository.save(attendence);
	}

	@Override
	@Transactional
	public void deleteAttendence(String attendenceId) {
		attendenceRepository.delete(attendenceId);
		
	}

	@Override
	@Transactional
	public List<EmployeeAttendence> allAttendence() {
		List<Employee> employeeList=employeeService.getEmployeeAll();
		List<Attendence> attendenceList=attendenceRepository.findAll();
		
		List<EmployeeAttendence> employeeAttendenceList=new ArrayList<EmployeeAttendence>();
		
		for(Employee emp:employeeList){
			EmployeeAttendence employeeAttendence=new EmployeeAttendence();
			List<Attendence> attList=new ArrayList<Attendence>();
			for(Attendence att:attendenceList) {
				if(att.getEmployeeId().equalsIgnoreCase(emp.getEmployeeId())) {
					attList.add(att);
				}
			}
			employeeAttendence.setEmployeeId(emp.getEmployeeId());
			employeeAttendence.setEmail(emp.getEmail());
			employeeAttendence.setFirstName(emp.getFirstName());
			employeeAttendence.setLastName(emp.getLastName());
			employeeAttendence.setAttendence(attList);
			employeeAttendenceList.add(employeeAttendence);
		}
	
		
		return employeeAttendenceList;
	}
}
