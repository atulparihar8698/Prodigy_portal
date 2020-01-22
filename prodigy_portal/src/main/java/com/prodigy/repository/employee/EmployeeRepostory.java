package com.prodigy.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodigy.model.employee.Employee;
@Repository
public interface EmployeeRepostory extends JpaRepository<Employee, String> {

}
