package com.prodigy.controller.designasion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
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
import com.prodigy.model.employee.Employee;
import com.prodigy.service.designasion.DesignasionService;

@RestController
@RequestMapping("/designasion")
@CrossOrigin(origins = "*")
public class DesignasionController {
	@Autowired
	private DesignasionService designasionService;

	@PostMapping(value = "/save")
	public ResponseEntity<Designasion> createDesignision(@RequestBody Designasion designasion) {
		return new ResponseEntity<Designasion>(designasionService.createDesignision(designasion), HttpStatus.CREATED);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<Designasion> updateDesignision(@RequestBody Designasion designasion) {
		System.out.println("=="+designasion);
		return new ResponseEntity<Designasion>(designasionService.updateDesignision(designasion),HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{designasionId}")
	public void deleteDesignision(@PathVariable("designasionId") Integer designasionId) {
		designasionService.deleteDesignision(designasionId);
	}
	@GetMapping("/designasionById/{designasionId}")
	public ResponseEntity<Designasion> getDesignasionById(@PathVariable("designasionId") String designasionId) {
		System.out.println("ID"+designasionId);
		return new ResponseEntity<Designasion>(designasionService.getDesignasionById(designasionId),HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Designasion>> allDesignision() {
		return new ResponseEntity<List<Designasion>>(designasionService.allDesignision(),HttpStatus.CREATED);
	}
}
