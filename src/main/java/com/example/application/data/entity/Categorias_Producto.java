package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Categorias_Producto")
public class Categorias_Producto {
    @Id
    @SequenceGenerator(name="beneseq", sequenceName = "beneficio_id_seq", allocationSize = 1)//Falta secuencia Categoria productos
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "beneseq")
    @Column(name = "idCatProducto")
    private Integer idCatProducto;

    @Column(name = "nombreCatProducto")
    private String nombreCatProducto;

    @Column(name = "activoCatProducto")
    private Boolean activoCatProducto;

    public Integer getIdCatProducto() {
        return this.idCatProducto;
    }

    public void setIdCatProducto(Integer idCatProducto) {
        this.idCatProducto = idCatProducto;
    }

    public String getNombreCatProducto() {
        return this.nombreCatProducto;
    }

    public void setNombreCatProducto(String nombreCatProducto) {
        this.nombreCatProducto = nombreCatProducto;
    }

    public Boolean isActivoCatProducto() {
        return this.activoCatProducto;
    }

    public Boolean getActivoCatProducto() {
        return this.activoCatProducto;
    }

    public void setActivoCatProducto(Boolean activoCatProducto) {
        this.activoCatProducto = activoCatProducto;
    }
}
