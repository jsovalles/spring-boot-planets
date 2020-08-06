package com.trycore.planets.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "planetas")
@Data
public class Planeta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "planeta", cascade = CascadeType.ALL)
    private List<Persona> personas;

    private int contador;

    private String nombre;

    private BigDecimal diametro;

    private BigDecimal masa;

    @Column(name = "radio_orbital")
    private BigDecimal radioOrbital;

    @Column(name = "periodo_orbital")
    private BigDecimal periodoOrbital;

    @Column(name = "periodo_rotacion")
    private BigDecimal periodoRotacion;

    private String foto;

}
