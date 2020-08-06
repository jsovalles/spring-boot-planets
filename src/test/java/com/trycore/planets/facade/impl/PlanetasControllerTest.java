package com.trycore.planets.facade.impl;

import com.trycore.planets.dao.entity.Planeta;
import com.trycore.planets.facade.dto.PlanetaDTO;
import com.trycore.planets.facade.dto.PlanetaListDTO;
import com.trycore.planets.facade.mapper.IMapper;
import com.trycore.planets.service.ServiceImpl;
import com.trycore.planets.utils.DummyMocks;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class PlanetasControllerTest {

    @InjectMocks
    PlanetasController controller;

    @Mock
    IMapper mapper;

    @Mock
    ServiceImpl srv;

    DummyMocks dummyMocks;

    @Before
    public void init(){
        dummyMocks = new DummyMocks();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void listPlanetas(){
        List<Planeta> dummyDAO = dummyMocks.listPlanetasDAO();
        List<PlanetaListDTO> dummyDTO = dummyMocks.listPlanetasDTO();
        Mockito.when(srv.listPlanetas()).thenReturn(dummyDAO);
        Mockito.when(mapper.listPlanetas(dummyDAO)).thenReturn(dummyDTO);
        List<PlanetaListDTO> planetas = controller.listPlanetas();
        System.out.println(planetas);
    }

    @Test
    public void getPlaneta() {
        Planeta dummyDAO = dummyMocks.getPlanetaDAO();
        PlanetaDTO dummyDTO = dummyMocks.getPlanetaDTO();
        Mockito.when(srv.getPlaneta(1)).thenReturn(dummyDAO);
        Mockito.when(mapper.getPlaneta(dummyDAO)).thenReturn(dummyDTO);
        PlanetaDTO planeta = controller.getPlaneta(1);
        System.out.println(planeta);

    }
}