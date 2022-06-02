package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Categorias_Proveedor")
public class Categorias_Proveedor {
    @Id
    @SequenceGenerator(name="catprov_seq", sequenceName = "categoria_proveedor_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "catprov_seq")
    @Column(name = "idCatProveedor")
    private Integer idCatProveedor;

    @Column(name = "nombreCatProveedor")
    private String nombreCatProveedor;

    @Column(name = "activoCatProveedor")
    private Boolean activoCatProveedor;

    public Integer getIdCatProveedor() {
        return this.idCatProveedor;
    }

    public void setIdCatProveedor(Integer idCatProveedor) {
        this.idCatProveedor = idCatProveedor;
    }

    public String getNombreCatProveedor() {
        return this.nombreCatProveedor;
    }

    public void setNombreCatProveedor(String nombreCatProveedor) {
        this.nombreCatProveedor = nombreCatProveedor;
    }

    public Boolean isActivoCatProveedor() {
        return this.activoCatProveedor;
    }

    public Boolean getActivoCatProveedor() {
        return this.activoCatProveedor;
    }

    public void setActivoCatProveedor(Boolean activoCatProveedor) {
        this.activoCatProveedor = activoCatProveedor;
    }
}
