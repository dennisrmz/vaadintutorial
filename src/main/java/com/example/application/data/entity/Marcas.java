package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Marcas")
public class Marcas {
    @Id
    @SequenceGenerator(name="marca_seq", sequenceName = "marcas_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
    @Column(name = "idMarca")
    private Integer idMarca;//Falta ManyToMany con productos

    @Column(name = "nombreMarca")
    private String nombreMarca;

    @Column(name = "activoMarca")
    private Boolean activoMarca;

    public Integer getIdMarca() {
        return this.idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return this.nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public Boolean isActivoMarca() {
        return this.activoMarca;
    }

    public Boolean getActivoMarca() {
        return this.activoMarca;
    }

    public void setActivoMarca(Boolean activoMarca) {
        this.activoMarca = activoMarca;
    }
}
