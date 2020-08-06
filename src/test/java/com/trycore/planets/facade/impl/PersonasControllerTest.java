package com.trycore.planets.facade.impl;

import com.trycore.planets.dao.entity.Persona;
import com.trycore.planets.facade.dto.PersonaDTO;
import com.trycore.planets.facade.dto.PersonaListDTO;
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

public class PersonasControllerTest {

    @InjectMocks
    PersonasController controller;

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
    public void listPersonas() {
        List<Persona> dummyDAO = dummyMocks.listPersonasDAO();
        List<PersonaListDTO> dummyDTO = dummyMocks.listPersonasDTO();
        Mockito.when(srv.listPersonas()).thenReturn(dummyDAO);
        Mockito.when(mapper.listPersonas(dummyDAO)).thenReturn(dummyDTO);
        List<PersonaListDTO> personas = controller.listPersonas();
        System.out.println(personas);
    }

    @Test
    public void getPersona() {
        Persona dummyDAO = dummyMocks.getPersonaDAO();
        PersonaDTO dummyDTO = dummyMocks.getPersonaDTO();
        Mockito.when(srv.getPersona(1)).thenReturn(dummyDAO);
        Mockito.when(mapper.getPersona(dummyDAO)).thenReturn(dummyDTO);
        PersonaDTO persona = controller.getPersona(1);
        System.out.println(persona);
    }
}