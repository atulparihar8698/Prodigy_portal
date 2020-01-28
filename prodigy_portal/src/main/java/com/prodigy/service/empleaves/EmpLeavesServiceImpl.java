package com.prodigy.service.empleaves;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.prodigy.model.empleaves.EmpLeaves;
import com.prodigy.repository.empleaves.EmpLeavesRepository;

@Service
public class EmpLeavesServiceImpl implements EmpLeavesService{
	@Autowired
	private EmpLeavesRepository empLeavesRepository;

	@Override
	@Transactional
	public EmpLeaves createEmpLeaves(EmpLeaves empLeaves) {
		return empLeavesRepository.save(empLeaves);
	}

	@Override
	@Transactional
	public EmpLeaves updateEmpLeaves(EmpLeaves empLeaves) {
		return empLeavesRepository.save(empLeaves);
	}

	@Override
	@Transactional
	public void deleteEmpLeaves(Integer empLeavesId) {
		empLeavesRepository.delete(empLeavesId);
	}

	@Override
	@Transactional
	public List<EmpLeaves> allEmpLeaves() {
		return empLeavesRepository.findAll();
	}

	@Override
	public EmpLeaves getEmpLeavesById(Integer empLeavesId) {
		
		return empLeavesRepository.findOne(empLeavesId);
	}
}
