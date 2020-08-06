package com.trycore.planets.facade.mapper.impl;

import com.trycore.planets.dao.entity.Planeta;
import com.trycore.planets.facade.dto.PlanetaDTO;
import com.trycore.planets.facade.dto.PlanetaListDTO;
import com.trycore.planets.utils.DummyMocks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class MapperTest {

    @InjectMocks
    Mapper mapper;

    DummyMocks dummyMocks;

    @Before
    public void init(){
        dummyMocks = new DummyMocks();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void listPlanetas() {

        List<Planeta> dao = dummyMocks.listPlanetasDAO();
        List<PlanetaListDTO> res = mapper.listPlanetas(dao);

        Assert.assertEquals(dao.get(0).getId(), res.get(0).getId());
        Assert.assertEquals(dao.get(0).getContador(), res.get(0).getNumeroVisitas());
        Assert.assertEquals(dao.get(0).getNombre(), res.get(0).getNombre());
        Assert.assertEquals(dao.get(0).getPersonas().size(), res.get(0).getCantidadPersonas());
        Assert.assertEquals(dao.get(0).getFoto(), res.get(0).getFoto());

    }

    @Test
    public void getPlaneta() {

        Planeta dao = dummyMocks.getPlanetaDAO();
        PlanetaDTO dto = mapper.getPlaneta(dao);

        Assert.assertEquals(dao.getNombre(),dto.getNombre());
        Assert.assertEquals(dao.getContador(),dto.getContador());
        Assert.assertEquals(dao.getDiametro(),dto.getDiametro());
        Assert.assertEquals(dao.getMasa(),dto.getMasa());
        Assert.assertEquals(dao.getRadioOrbital(),dto.getRadioOrbital());
        Assert.assertEquals(dao.getPeriodoOrbital(),dto.getPeriodoOrbital());
        Assert.assertEquals(dao.getPeriodoRotacion(),dto.getPeriodoRotacion());
        Assert.assertEquals(dao.getFoto(),dto.getFoto());
    }

    @Test
    public void listPersonas() {
    }

    @Test
    public void getPersona() {
    }
}