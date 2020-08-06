package com.trycore.planets.dao;

import com.trycore.planets.dao.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDAO extends JpaRepository<Persona, Integer> {

}
