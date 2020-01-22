package com.prodigy.controller.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodigy.model.department.Department;
import com.prodigy.service.department.DepartmentService;

@RestController
@RequestMapping("/department")
@CrossOrigin(origins = "*")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping(value = "/save")
	public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
		return new ResponseEntity<Department>(departmentService.createDepartment(department), HttpStatus.CREATED);
	}

	@PutMapping(value = "update")
	public ResponseEntity<Department> updateDepartment(@RequestBody Department department) {
		return new ResponseEntity<Department>(departmentService.updateDepartment(department),HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{departmentId}")
	public void deleteDepartment(@PathVariable("departmentId") Integer departmentId) {
		departmentService.deleteDepartment(departmentId);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Department>> allDepartment() {
		return new ResponseEntity<List<Department>>(departmentService.allDepartment(),HttpStatus.CREATED);
	}

}
