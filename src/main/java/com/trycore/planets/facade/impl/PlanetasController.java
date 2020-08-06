package com.trycore.planets.facade.impl;

import com.trycore.planets.dao.entity.Planeta;
import com.trycore.planets.facade.dto.PlanetaDTO;
import com.trycore.planets.facade.dto.PlanetaListDTO;
import com.trycore.planets.facade.mapper.IMapper;
import com.trycore.planets.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planetas")
@CrossOrigin({"http://localhost:4200","https://jsovalles.github.io"})
public class PlanetasController {

    @Autowired
    private IMapper mapper;

    @Autowired
    private ServiceImpl service;

    @GetMapping
    public List<PlanetaListDTO> listPlanetas(){

        List<Planeta> daoOut = service.listPlanetas();

        return mapper.listPlanetas(daoOut);
    }

    @GetMapping(value = "/{id}")
    public PlanetaDTO getPlaneta(@PathVariable(value = "id") int id){

        Planeta out = service.getPlaneta(id);

        return mapper.getPlaneta(out);
    }

}
