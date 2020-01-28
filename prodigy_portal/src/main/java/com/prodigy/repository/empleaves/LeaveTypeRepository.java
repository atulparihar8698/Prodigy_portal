package com.prodigy.repository.empleaves;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prodigy.model.empleaves.LeaveType;

@Repository
public interface LeaveTypeRepository extends JpaRepository<LeaveType, Integer>{

}
