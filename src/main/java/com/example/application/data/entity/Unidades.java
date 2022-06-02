package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Unidades")
public class Unidades {
    @Id
    @SequenceGenerator(name="u_seq", sequenceName = "unidad_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "u_seq")
    @Column(name = "idUnidad")
    private Integer idUnidad;

    @Column(name = "nombreUnidades")
    private String nombreUnidades;

    @Column(name = "activoUnidades")
    private Boolean activoUnidades = true;


    public Integer getIdUnidad() {
        return this.idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getNombreUnidades() {
        return this.nombreUnidades;
    }

    public void setNombreUnidades(String nombreUnidades) {
        this.nombreUnidades = nombreUnidades;
    }

    public Boolean isActivoUnidades() {
        return this.activoUnidades;
    }

    public Boolean getActivoUnidades() {
        return this.activoUnidades;
    }

    public void setActivoUnidades(Boolean activoUnidades) {
        this.activoUnidades = activoUnidades;
    }
}
