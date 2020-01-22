package com.prodigy.repository.designasion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodigy.model.designasion.Designasion;
@Repository
public interface DesignasionRepository extends JpaRepository<Designasion, Integer> {

}
