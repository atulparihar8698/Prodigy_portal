package com.prodigy.service.empleaves;

import java.util.List;

import com.prodigy.model.empleaves.EmpLeaves;

public interface EmpLeavesService {
	public EmpLeaves createEmpLeaves(EmpLeaves empLeaves);

	public EmpLeaves updateEmpLeaves(EmpLeaves empLeaves);

	public void deleteEmpLeaves(Integer empLeavesId);

	public List<EmpLeaves> allEmpLeaves();

	public EmpLeaves getEmpLeavesById(Integer empLeavesId);
}
