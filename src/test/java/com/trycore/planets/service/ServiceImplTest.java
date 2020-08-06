package com.trycore.planets.service;

import com.trycore.planets.dao.IPersonaDAO;
import com.trycore.planets.dao.IPlanetasDAO;
import com.trycore.planets.dao.entity.Planeta;
import com.trycore.planets.utils.DummyMocks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class ServiceImplTest {

    @InjectMocks
    ServiceImpl srv;

    @Mock
    IPersonaDAO personasDAO;

    @Mock
    IPlanetasDAO planetasDAO;

    private DummyMocks dummyMocks;

    @Before
    public void init(){
        dummyMocks = new DummyMocks();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void listPlanetas() {

        List<Planeta> dao = dummyMocks.listPlanetasDAO();

        Mockito.when(planetasDAO.findAll()).thenReturn(dao);

        List<Planeta> res =  srv.listPlanetas();

        Assert.assertEquals(dao,res);

    }

    @Test
    public void getPlaneta() {

        Planeta dao = dummyMocks.getPlanetaDAO();

        Mockito.when(planetasDAO.findById(1)).thenReturn(java.util.Optional.ofNullable(dao));

        Planeta res = srv.getPlaneta(1);

        Assert.assertEquals(dao,res);

    }

    @Test
    public void listPersonas() {
    }

    @Test
    public void getPersona() {
    }
}