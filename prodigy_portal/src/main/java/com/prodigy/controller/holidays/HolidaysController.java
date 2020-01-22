package com.prodigy.controller.holidays;

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

import com.prodigy.model.holidays.Holiday;
import com.prodigy.service.holidays.HolidaysService;

@RestController
@RequestMapping("/holidays")
@CrossOrigin(origins = "*")
public class HolidaysController {
	@Autowired
	private HolidaysService holidaysService;

	@PostMapping(value = "/save")
	public ResponseEntity<Holiday> createHoliday(@RequestBody Holiday holiday) {
		return new ResponseEntity<Holiday>(holidaysService.createHoliday(holiday), HttpStatus.CREATED);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<Holiday> updateHoliday(@RequestBody Holiday holiday) {
		return new ResponseEntity<Holiday>(holidaysService.updateHoliday(holiday),HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{holidayId}")
	public void deleteHoliday(@PathVariable("holidayId") Integer holidayId) {
		holidaysService.deleteHoliday(holidayId);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Holiday>> allHoliday() {
		return new ResponseEntity<List<Holiday>>(holidaysService.allHoliday(),HttpStatus.CREATED);
	}
}
