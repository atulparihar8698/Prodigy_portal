package com.prodigy.controller.company;

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

import com.prodigy.model.company.Company;
import com.prodigy.model.designasion.Designasion;
import com.prodigy.service.company.CompanyService;
import com.prodigy.service.designasion.DesignasionService;
@RestController
@RequestMapping("/company")
@CrossOrigin(origins = "*")
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@PostMapping(value = "/save")
	public ResponseEntity<Company> createCompany(@RequestBody Company company) {
		return new ResponseEntity<Company>(companyService.createCompany(company), HttpStatus.CREATED);
	}

	@PutMapping(value = "update")
	public ResponseEntity<Company> updateCompany(@RequestBody Company company) {
		return new ResponseEntity<Company>(companyService.updateCompany(company),HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{companyId}")
	public void deleteCompany(@PathVariable("companyId") Integer companyId) {
		companyService.deleteCompany(companyId);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Company>> allCompany() {
		return new ResponseEntity<List<Company>>(companyService.allCompany(),HttpStatus.CREATED);
	}
}
