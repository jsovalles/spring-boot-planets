package com.trycore.planets.utils;

import com.trycore.planets.dao.entity.Persona;
import com.trycore.planets.dao.entity.Planeta;
import com.trycore.planets.facade.dto.PersonaDTO;
import com.trycore.planets.facade.dto.PersonaListDTO;
import com.trycore.planets.facade.dto.PlanetaDTO;
import com.trycore.planets.facade.dto.PlanetaListDTO;
import org.h2.table.Plan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DummyMocks {

    public List<Planeta> listPlanetasDAO(){

        List<Planeta> planetas = new ArrayList<>();

        Planeta mercurio = new Planeta();
        mercurio.setId(1);
        mercurio.setNombre("Mercurio");
        mercurio.setContador(1);
        mercurio.setPersonas(new ArrayList<>());
        mercurio.getPersonas().add(new Persona());
        mercurio.getPersonas().add(new Persona());
        mercurio.setFoto("assets/images/mercurio.png");
        planetas.add(mercurio);

        Planeta venus = new Planeta();
        venus.setId(2);
        venus.setNombre("Venus");
        venus.setContador(1);
        venus.setPersonas(new ArrayList<>());
        venus.getPersonas().add(new Persona());
        venus.getPersonas().add(new Persona());
        venus.setFoto("assets/images/venus.png");
        planetas.add(venus);

        return planetas;

    }

    public List<PlanetaListDTO> listPlanetasDTO(){

        List<PlanetaListDTO> planetas = new ArrayList<>();

        PlanetaListDTO mercurio = new PlanetaListDTO();
        mercurio.setId(1);
        mercurio.setNombre("Mercurio");
        mercurio.setNumeroVisitas(1);
        mercurio.setCantidadPersonas(2);
        mercurio.setFoto("assets/images/mercurio.png");
        planetas.add(mercurio);

        PlanetaListDTO venus = new PlanetaListDTO();
        venus.setId(2);
        venus.setNombre("venus");
        venus.setNumeroVisitas(1);
        venus.setCantidadPersonas(2);
        venus.setFoto("assets/images/venus.png");
        planetas.add(venus);

        return planetas;

    }

    public Planeta getPlanetaDAO() {

        Planeta mercurio = new Planeta();
        mercurio.setPersonas(new ArrayList<>());
        mercurio.setContador(2);
        mercurio.setNombre("Mercurio");
        mercurio.setDiametro(BigDecimal.valueOf(4878.00));
        mercurio.setMasa(BigDecimal.valueOf(0.06));
        mercurio.setRadioOrbital(BigDecimal.valueOf(0.39));
        mercurio.setPeriodoOrbital(BigDecimal.valueOf(0.24));
        mercurio.setPeriodoRotacion(BigDecimal.valueOf(58.66));
        mercurio.setFoto("assets/images/mercurio.png");

        return mercurio;
    }

    public PlanetaDTO getPlanetaDTO(){

        PlanetaDTO mercurio = new PlanetaDTO();
        mercurio.setPersonas(new ArrayList<>());
        mercurio.setContador(2);
        mercurio.setNombre("Mercurio");
        mercurio.setDiametro(BigDecimal.valueOf(4878.00));
        mercurio.setMasa(BigDecimal.valueOf(0.06));
        mercurio.setRadioOrbital(BigDecimal.valueOf(0.39));
        mercurio.setPeriodoOrbital(BigDecimal.valueOf(0.24));
        mercurio.setPeriodoRotacion(BigDecimal.valueOf(58.66));
        mercurio.setFoto("assets/images/mercurio.png");

        return mercurio;
    }

    public List<Persona> listPersonasDAO(){
        return null;
    }

    public List<PersonaListDTO> listPersonasDTO(){
        return null;
    }

    public Persona getPersonaDAO(){return null;}

    public PersonaDTO getPersonaDTO(){return null;}
}
