package com.prodigy.repository.holidays;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodigy.model.holidays.Holiday;
@Repository
public interface HolidayRepository extends JpaRepository<Holiday, Integer>{

}
