package com.prodigy.repository.empleaves;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prodigy.model.empleaves.EmpLeaves;

@Repository
public interface EmpLeavesRepository extends JpaRepository<EmpLeaves, Integer>{
	
}
