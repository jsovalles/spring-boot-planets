package com.trycore.planets.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "personas")
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Planeta planeta;

    private String nombre;

    @Column(name = "numero_visitas")
    private int numeroVisitas;

    private int edad;

    private BigDecimal altura;

    private BigDecimal peso;

    private String genero;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

}
