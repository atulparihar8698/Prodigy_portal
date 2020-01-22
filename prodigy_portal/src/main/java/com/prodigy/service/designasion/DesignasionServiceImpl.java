package com.prodigy.service.designasion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.prodigy.model.designasion.Designasion;
import com.prodigy.repository.designasion.DesignasionRepository;

@Service
public class DesignasionServiceImpl implements DesignasionService {
	@Autowired
	private DesignasionRepository designasionRepository;

	@Override
	@Transactional
	public Designasion createDesignision(Designasion designasion) {
		return designasionRepository.save(designasion);
	}

	@Override
	@Transactional
	public Designasion updateDesignision(Designasion designasion) {
		return designasionRepository.save(designasion);
	}

	@Override
	@Transactional
	public void deleteDesignision(Integer designasionId) {
		designasionRepository.delete(designasionId);
	}

	@Override
	@Transactional
	public List<Designasion> allDesignision() {
		return designasionRepository.findAll();
	}

	@Override
	public Designasion getDesignasionById(String designasionId) {
		
		return null;
	}
	
}
