package com.trycore.planets.service;

import com.trycore.planets.dao.IPersonaDAO;
import com.trycore.planets.dao.IPlanetasDAO;
import com.trycore.planets.dao.entity.Persona;
import com.trycore.planets.dao.entity.Planeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl {

    @Autowired
    IPlanetasDAO daoPlanetas;

    @Autowired
    IPersonaDAO daoPersonas;

    public List<Planeta> listPlanetas(){
        return daoPlanetas.findAll();
    }

    public Planeta getPlaneta(int id){

        Planeta planeta = daoPlanetas.findById(id).orElse(null);

        planeta.setContador(planeta.getContador() + 1);

        daoPlanetas.save(planeta);

        return planeta;
    }

    public List<Persona> listPersonas(){ return daoPersonas.findAll();}

    public Persona getPersona(int id){

        Persona persona = daoPersonas.findById(id).orElse(null);

        persona.setNumeroVisitas(persona.getNumeroVisitas() + 1);

        persona.getPlaneta().setContador(persona.getPlaneta().getContador() + 1);

        daoPersonas.save(persona);

        return persona;
    }

}
