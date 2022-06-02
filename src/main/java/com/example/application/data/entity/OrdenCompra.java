package com.example.application.data.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "ORDENCOMPRA")
public class OrdenCompra{

    @Id
    @SequenceGenerator(name="marca_seq", sequenceName = "orden_compra_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
    @Column(name = "id")
    private Integer id;//Falta ManyToMany con productos

    @Column(name = "areasolicitante")
    private String areasolicitante;

    @Column(name = "nombresolicitante")
    private String nombresolicitante;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "fecha")
    private LocalDate fecha;


    public String getAreaSolicitante() {
        return this.areasolicitante;
    }

    public void setAreaSolicitante(String areasolicitante) {
        this.areasolicitante = areasolicitante;
    }

    public String getNombreSolicitante() {
        return this.nombresolicitante;
    }

    public void setNombreSolicitante(String nombresolicitante) {
        this.nombresolicitante = nombresolicitante;
    }

    public String getDetalle() {
        return this.detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
