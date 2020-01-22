package com.prodigy.repository.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodigy.model.department.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
