package com.prodigy.service.designasion;

import java.util.List;

import com.prodigy.model.designasion.Designasion;
import com.prodigy.model.employee.Employee;

public interface DesignasionService {
	public Designasion createDesignision(Designasion designasion);

	public Designasion updateDesignision(Designasion designasion);

	public void deleteDesignision(Integer designasionId);

	public List<Designasion> allDesignision();

	public Designasion getDesignasionById(String designasionId);
}
