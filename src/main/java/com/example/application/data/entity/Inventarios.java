package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Inventarios")
public class Inventarios {
    @Id
    @SequenceGenerator(name="inv_seq", sequenceName = "inventario_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inv_seq")
    @Column(name = "idInventario")
    private Integer idInventario;

    @Column(name = "tipoInventario")
    private Integer tipoInventario;

    @Column(name = "cantidadInventario")
    private Integer cantidadInventario;


    public Integer getIdInventario() {
        return this.idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Integer getTipoInventario() {
        return this.tipoInventario;
    }

    public void setTipoInventario(Integer tipoInventario) {
        this.tipoInventario = tipoInventario;
    }

    public Integer getCantidadInventario() {
        return this.cantidadInventario;
    }

    public void setCantidadInventario(Integer cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
}
