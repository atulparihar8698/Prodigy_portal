package com.prodigy.service.department;

import java.util.List;
import com.prodigy.model.department.Department;



public interface DepartmentService {
	public Department createDepartment(Department department);

	public Department updateDepartment(Department department);

	public void deleteDepartment(Integer departmentId);

	public List<Department> allDepartment();
}
