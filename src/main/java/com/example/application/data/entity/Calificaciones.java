package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Calificaciones")
public class Calificaciones {
    @Id
    @SequenceGenerator(name="cali_seq", sequenceName = "califiacion_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cali_seq")
    @Column(name = "idCalificacion")
    private Integer idCalificacion;

    @Column(name = "nombreCalificacion")
    private String nombreCalificacion;

    @Column(name = "activoCalificacion")
    private Boolean activoCalificacion;

    public Integer getIdCalificacion() {
        return this.idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public String getNombreCalificacion() {
        return this.nombreCalificacion;
    }

    public void setNombreCalificacion(String nombreCalificacion) {
        this.nombreCalificacion = nombreCalificacion;
    }

    public Boolean isActivoCalificacion() {
        return this.activoCalificacion;
    }

    public Boolean getActivoCalificacion() {
        return this.activoCalificacion;
    }

    public void setActivoCalificacion(Boolean activoCalificacion) {
        this.activoCalificacion = activoCalificacion;
    }
}
