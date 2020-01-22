package com.prodigy.controller.attendence;

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

import com.prodigy.bean.EmployeeAttendence;
import com.prodigy.model.attendence.Attendence;
import com.prodigy.service.attendence.AttendenceService;
@RestController
@RequestMapping("/attendence")
@CrossOrigin(origins = "*")
public class AttendenceController {
	@Autowired
	private AttendenceService attendenceService;

	@GetMapping(value = "/save")
	public ResponseEntity<Attendence> createAttendence() {
		
		return new ResponseEntity<Attendence>(attendenceService.createAttendence(), HttpStatus.CREATED);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<Attendence> updateAttendence(@RequestBody Attendence attendence) {
		return new ResponseEntity<Attendence>(attendenceService.updateAttendence(attendence),HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{attendenceId}")
	public void deleteAttendence(@PathVariable("attendenceId") String attendenceId) {
		attendenceService.deleteAttendence(attendenceId);
	}

	@GetMapping("/all")
	public ResponseEntity<List<EmployeeAttendence>> allAttendence() {
		return new ResponseEntity<List<EmployeeAttendence>>(attendenceService.allAttendence(),HttpStatus.CREATED);
	}
}
