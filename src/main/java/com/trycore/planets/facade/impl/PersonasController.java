package com.trycore.planets.facade.impl;

import com.trycore.planets.dao.entity.Persona;
import com.trycore.planets.facade.dto.PersonaDTO;
import com.trycore.planets.facade.dto.PersonaListDTO;
import com.trycore.planets.facade.mapper.IMapper;
import com.trycore.planets.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
@CrossOrigin({"http://localhost:4200","https://jsovalles.github.io"})
public class PersonasController {

    @Autowired
    private IMapper mapper;

    @Autowired
    private ServiceImpl service;

    @GetMapping
    public List<PersonaListDTO> listPersonas(){

        List<Persona> daoOut = service.listPersonas();

        return mapper.listPersonas(daoOut);
    }

    @GetMapping("/{id}")
    public PersonaDTO getPersona(@PathVariable(value = "id") int id){

        Persona daoOut = service.getPersona(id);

        return mapper.getPersona(daoOut);
    }
}
