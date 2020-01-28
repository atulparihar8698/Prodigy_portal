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

import com.prodigy.model.empleaves.EmpLeaves;
import com.prodigy.model.empleaves.LeaveType;
import com.prodigy.service.empleaves.LeaveTypesService;

@RestController
@RequestMapping("/leavetype")
@CrossOrigin(origins = "*")
public class LeaveTypeController {
	@Autowired
	private LeaveTypesService leaveTypesService;

	@PostMapping(value = "/save")
	public ResponseEntity<LeaveType> createLeaveType(@RequestBody LeaveType leaveType) {
		return new ResponseEntity<LeaveType>(leaveTypesService.createLeaveType(leaveType), HttpStatus.CREATED);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<LeaveType> updateLeaveType(@RequestBody LeaveType leaveType) {
		return new ResponseEntity<LeaveType>(leaveTypesService.updateLeaveType(leaveType),HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{leaveTypeId}")
	public void deleteLeaveType(@PathVariable("leaveTypeId") Integer leaveTypeId) {
		leaveTypesService.deleteLeaveType(leaveTypeId);
	}
	@GetMapping("/leaveTypeById/{leaveTypeId}")
	public ResponseEntity<LeaveType> getLeaveTypeById(@PathVariable("leaveTypeId") String leaveTypeId) {
		return new ResponseEntity<LeaveType>(leaveTypesService.getLeaveTypeById(leaveTypeId),HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<LeaveType>> allLeaveType() {
		return new ResponseEntity<List<LeaveType>>(leaveTypesService.allLeaveType(),HttpStatus.CREATED);
	}
}
