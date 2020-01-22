package com.prodigy.service.holidays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodigy.model.holidays.Holiday;
import com.prodigy.repository.holidays.HolidayRepository;

@Service
public class HolidaysServiceImpl implements HolidaysService{
	@Autowired
	private HolidayRepository holidayRepository;

	@Override
	@Transactional
	public Holiday createHoliday(Holiday holiday) {
		return holidayRepository.save(holiday);
	}

	@Override
	@Transactional
	public Holiday updateHoliday(Holiday holiday) {
		return holidayRepository.save(holiday);
	}

	@Override
	@Transactional
	public void deleteHoliday(Integer holiday_id) {
		holidayRepository.delete(holiday_id);
		
	}

	@Override
	@Transactional
	public List<Holiday> allHoliday() {
		return holidayRepository.findAll();
	}
}
