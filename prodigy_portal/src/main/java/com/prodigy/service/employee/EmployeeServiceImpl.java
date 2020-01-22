package com.prodigy.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodigy.model.employee.Employee;
import com.prodigy.repository.employee.EmployeeRepostory;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepostory employeeRepostory;

	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		
		return employeeRepostory.save(employee);
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		return employeeRepostory.save(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(String employeeId) {
		
		 employeeRepostory.delete(employeeId);;
	}

	@Override
	@Transactional
	public Employee getEmployeeById(String employeeId) {
		return employeeRepostory.findOne(employeeId);
	}

	@Override
	@Transactional
	public List<Employee> getEmployeeAll() {
		
		return employeeRepostory.findAll();
	}
	@Override
	@Transactional
	public String getMaxEmployeeID() {
		String employeeID="";
		List<Employee> employee=employeeRepostory.findAll();
		if(employee.size()>0) {
			int j=0;
			for(int i=0;i<employee.size();i++) {
				if(Integer.parseInt(employee.get(i).getEmployeeId().substring(4))> j) {
					j=Integer.parseInt(employee.get(i).getEmployeeId().substring(4));
				}
			}
			j=j+1;
			employeeID="PGI-"+j;
		}else {
			employeeID="PGI-1";
		}
		return employeeID;
	}
}
