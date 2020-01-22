package com.prodigy.service.holidays;

import java.util.List;

import com.prodigy.model.holidays.Holiday;

public interface HolidaysService {
	
	public Holiday createHoliday(Holiday holiday);

	public Holiday updateHoliday(Holiday holiday);

	public void deleteHoliday(Integer holidayId);

	public List<Holiday> allHoliday();
}
