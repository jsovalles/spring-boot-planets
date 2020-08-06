package com.trycore.planets.facade.dto;

import com.trycore.planets.dao.entity.Planeta;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PersonaListDTO {

    private int id;

    private PlanetaListDTO planeta;

    private String nombre;

    private int numeroVisitas;

}
