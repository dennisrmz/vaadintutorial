package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Departamentos")
public class Departamentos {
    @Id
    @SequenceGenerator(name="refcome_seq", sequenceName = "referencia_comercial_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refcome_seq")
    @Column(name = "idRefereciaComercial")
    private Integer idRefereciaComercial;

    @Column(name = "nombreDepartamento")
    private String nombreDepartamento;

    @Column(name = "activoDepartamento")
    private Boolean activoDepartamento;

    public Integer getIdRefereciaComercial() {
        return this.idRefereciaComercial;
    }

    public void setIdRefereciaComercial(Integer idRefereciaComercial) {
        this.idRefereciaComercial = idRefereciaComercial;
    }

    public String getNombreDepartamento() {
        return this.nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Boolean isActivoDepartamento() {
        return this.activoDepartamento;
    }

    public Boolean getActivoDepartamento() {
        return this.activoDepartamento;
    }

    public void setActivoDepartamento(Boolean activoDepartamento) {
        this.activoDepartamento = activoDepartamento;
    }
}
