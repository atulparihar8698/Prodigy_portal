package com.prodigy.controller.empleaves;

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

import com.prodigy.model.designasion.Designasion;
import com.prodigy.model.empleaves.EmpLeaves;
import com.prodigy.service.empleaves.EmpLeavesService;

@RestController
@RequestMapping("/empleaves")
@CrossOrigin(origins = "*")
public class EmpLeavesController {
	@Autowired
	private EmpLeavesService empLeavesService;

	@PostMapping(value = "/save")
	public ResponseEntity<EmpLeaves> createEmpLeaves(@RequestBody EmpLeaves empLeaves) {
		return new ResponseEntity<EmpLeaves>(empLeavesService.createEmpLeaves(empLeaves), HttpStatus.CREATED);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<EmpLeaves> updateEmpLeaves(@RequestBody EmpLeaves empLeaves) {
		return new ResponseEntity<EmpLeaves>(empLeavesService.updateEmpLeaves(empLeaves),HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{empLeavesId}")
	public void deleteEmpLeaves(@PathVariable("empLeavesId") Integer empLeavesId) {
		empLeavesService.deleteEmpLeaves(empLeavesId);
	}
	@GetMapping("/empLeavesById/{empLeavesId}")
	public ResponseEntity<EmpLeaves> getEmpLeavesById(@PathVariable("empLeavesId") Integer empLeavesId) {
		System.out.println(empLeavesService.getEmpLeavesById(empLeavesId));
		
		return new ResponseEntity<EmpLeaves>(empLeavesService.getEmpLeavesById(empLeavesId),HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<EmpLeaves>> allEmpLeaves() {
		return new ResponseEntity<List<EmpLeaves>>(empLeavesService.allEmpLeaves(),HttpStatus.CREATED);
	}
}
