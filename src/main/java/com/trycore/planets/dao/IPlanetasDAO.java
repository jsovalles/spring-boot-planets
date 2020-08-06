package com.trycore.planets.dao;

import com.trycore.planets.dao.entity.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPlanetasDAO extends JpaRepository<Planeta, Integer> {
}
