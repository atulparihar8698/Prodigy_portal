package com.prodigy.repository.attendence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prodigy.model.attendence.Attendence;

@Repository
public interface AttendenceRepository extends JpaRepository<Attendence, String>{

}
