package com.prodigy.service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodigy.model.company.Company;
import com.prodigy.repository.company.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	@Transactional
	public Company createCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	@Transactional
	public Company updateCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	@Transactional
	public void deleteCompany(Integer companyId) {
		companyRepository.delete(companyId);
		
	}

	@Override
	@Transactional
	public List<Company> allCompany() {
		return companyRepository.findAll();
	}
}
