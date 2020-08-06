package com.trycore.planets.facade.mapper;

import com.trycore.planets.dao.entity.Persona;
import com.trycore.planets.dao.entity.Planeta;
import com.trycore.planets.facade.dto.PersonaDTO;
import com.trycore.planets.facade.dto.PersonaListDTO;
import com.trycore.planets.facade.dto.PlanetaDTO;
import com.trycore.planets.facade.dto.PlanetaListDTO;

import java.util.List;

public interface IMapper {

    List<PlanetaListDTO> listPlanetas(List<Planeta> daoOut);

    PlanetaDTO getPlaneta(Planeta daoOut);

    List<PersonaListDTO> listPersonas(List<Persona> daoOut);

    PersonaDTO getPersona(Persona daoOut);
}
