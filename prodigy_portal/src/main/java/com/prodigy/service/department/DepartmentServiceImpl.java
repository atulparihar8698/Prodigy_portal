package com.prodigy.service.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.prodigy.model.department.Department;
import com.prodigy.repository.department.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	@Transactional
	public Department createDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	@Transactional
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	@Transactional
	public void deleteDepartment(Integer departmentId) {
		departmentRepository.delete(departmentId);
		
	}

	@Override
	@Transactional
	public List<Department> allDepartment() {
		return departmentRepository.findAll();
	}

}
