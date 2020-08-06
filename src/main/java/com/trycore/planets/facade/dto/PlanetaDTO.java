package com.trycore.planets.facade.dto;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PlanetaDTO {

    private List<PersonaListDTO> personas;

    private int contador;

    private String nombre;

    private BigDecimal diametro;

    private BigDecimal masa;

    private BigDecimal radioOrbital;

    private BigDecimal periodoOrbital;

    private BigDecimal periodoRotacion;

    private String foto;

}
