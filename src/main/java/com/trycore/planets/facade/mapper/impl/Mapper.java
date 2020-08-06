package com.trycore.planets.facade.mapper.impl;

import com.trycore.planets.dao.entity.Persona;
import com.trycore.planets.dao.entity.Planeta;
import com.trycore.planets.facade.dto.PersonaDTO;
import com.trycore.planets.facade.dto.PersonaListDTO;
import com.trycore.planets.facade.dto.PlanetaDTO;
import com.trycore.planets.facade.dto.PlanetaListDTO;
import com.trycore.planets.facade.mapper.IMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Mapper implements IMapper {

    @Override
    public List<PlanetaListDTO> listPlanetas(List<Planeta> daoOut) {

        List<PlanetaListDTO> planetas = new ArrayList<>();

        for(Planeta entity : daoOut){
            PlanetaListDTO planeta = new PlanetaListDTO();
            planeta.setId(entity.getId());
            planeta.setNombre(entity.getNombre());
            planeta.setNumeroVisitas(entity.getContador());
            planeta.setCantidadPersonas(entity.getPersonas().size());
            planeta.setFoto(entity.getFoto());
            planetas.add(planeta);
        }

        return planetas;

    }

    @Override
    public PlanetaDTO getPlaneta(Planeta daoOut) {

        PlanetaDTO planeta = new PlanetaDTO();
        planeta.setContador(daoOut.getContador());
        planeta.setNombre(daoOut.getNombre());
        planeta.setDiametro(daoOut.getDiametro());
        planeta.setMasa(daoOut.getMasa());
        planeta.setRadioOrbital(daoOut.getRadioOrbital());
        planeta.setPeriodoOrbital(daoOut.getPeriodoOrbital());
        planeta.setPeriodoRotacion(daoOut.getPeriodoRotacion());
        planeta.setFoto(daoOut.getFoto());

        planeta.setPersonas(new ArrayList<>());
        for(Persona outPersonas : daoOut.getPersonas()){
            PersonaListDTO persona = new PersonaListDTO();
            persona.setNombre(outPersonas.getNombre());
            planeta.getPersonas().add(persona);
        }

        return planeta;

    }

    @Override
    public List<PersonaListDTO> listPersonas(List<Persona> daoOut) {
        List<PersonaListDTO> personas = new ArrayList<>();

        for(Persona out : daoOut){
            PersonaListDTO persona = new PersonaListDTO();
            persona.setId(out.getId());
            persona.setNombre(out.getNombre());
            persona.setNumeroVisitas(out.getNumeroVisitas());
            persona.setPlaneta(new PlanetaListDTO());
            persona.getPlaneta().setNombre(out.getPlaneta().getNombre());
            personas.add(persona);
        }

        return personas;
    }

    @Override
    public PersonaDTO getPersona(Persona daoOut) {

        PersonaDTO persona = new PersonaDTO();



        persona.setNombre(daoOut.getNombre());
        persona.setNumeroVisitas(daoOut.getNumeroVisitas());
        persona.setEdad(daoOut.getEdad());
        persona.setAltura(daoOut.getAltura());
        persona.setPeso(daoOut.getPeso());
        persona.setGenero(daoOut.getGenero());
        persona.setFechaNacimiento(daoOut.getFechaNacimiento());
        persona.setPlaneta(new PlanetaListDTO());
        persona.getPlaneta().setNombre(daoOut.getPlaneta().getNombre());

        return persona;

    }
}
