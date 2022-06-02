package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Estado_Cotizacion")
public class Estado_Cotizacion {
    @Id
    @SequenceGenerator(name="estadocot_seq", sequenceName = "estado_cotizacion_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estadocot_seq")
    @Column(name = "idEstadoCot")
    private Integer idEstadoCot;

    @Column(name = "nombreEstadoCot")
    private String nombreEstadoCot;

    public Integer getIdEstadoCot() {
        return this.idEstadoCot;
    }

    public void setIdEstadoCot(Integer idEstadoCot) {
        this.idEstadoCot = idEstadoCot;
    }

    public String getNombreEstadoCot() {
        return this.nombreEstadoCot;
    }

    public void setNombreEstadoCot(String nombreEstadoCot) {
        this.nombreEstadoCot = nombreEstadoCot;
    }
}
