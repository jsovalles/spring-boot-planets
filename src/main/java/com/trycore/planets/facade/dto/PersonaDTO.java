package com.trycore.planets.facade.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PersonaDTO {

    private PlanetaListDTO planeta;

    private String nombre;

    private int numeroVisitas;

    private int edad;

    private BigDecimal altura;

    private BigDecimal peso;

    private String genero;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date fechaNacimiento;
}
