package com.prodigy.service.company;

import java.util.List;

import com.prodigy.model.company.Company;

public interface CompanyService {

	public Company createCompany(Company company);

	public Company updateCompany(Company company);

	public void deleteCompany(Integer companyId);

	public List<Company> allCompany();

}
