package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Calidad_Proveedores")
public class Calidad_Proveedores {
    @Id
    @SequenceGenerator(name="cali_pro_seq", sequenceName = "calidadproveedor_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cali_pro_seq")
    @Column(name = "idCalidad")
    private Integer idCalidad;

    @Column(name = "nombreCalidad")
    private String nombreCalidad;

    public Integer getIdCalidad() {
        return this.idCalidad;
    }

    public void setIdCalidad(Integer idCalidad) {
        this.idCalidad = idCalidad;
    }

    public String getNombreCalidad() {
        return this.nombreCalidad;
    }

    public void setNombreCalidad(String nombreCalidad) {
        this.nombreCalidad = nombreCalidad;
    }
}
