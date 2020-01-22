package com.prodigy.repository.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodigy.model.company.Company;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
