package com.example.application.data.entity;

import javax.persistence.*;

@Entity
@Table(name="Productos")
public class Producto{
    @Id
    @SequenceGenerator(name = "producto_id_seq", sequenceName = "producto_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "")
    @Column(name = "idproducto")
    private Double idproducto;

    @Column(name = "idunidades")
    private Double idunidades;

    @Column(name = "idcatproducto")
    private Double idcatproducto;

    @Column(name = "precioproducto")
    private Double precioproducto;

    @Column(name = "caracteristicas")
    private String caracteristicas;

    @Column(name = "color")
    private String color;

    @Column(name = "utilidad")
    private String utilidad;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "medida")
    private Double medida;

    @Column(name = "garantia")
    private String garantia;

    @Column(name = "imagen")
    private Double imagen;

    @Column(name = "cantidad")
    private Double cantidad;

    @Column(name = "minimo")
    private Double minimo;


    public Double getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Double idproducto) {
        this.idproducto = idproducto;
    }

    public Double getIdunidades() {
        return idunidades;
    }

    public void setIdunidades(Double idunidades) {
        this.idunidades = idunidades;
    }

    public Double getIdcatproducto() {
        return idcatproducto;
    }

    public void setIdcatproducto(Double idcatproducto) {
        this.idcatproducto = idcatproducto;
    }

    public Double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(Double precioproducto) {
        this.precioproducto = precioproducto;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMedia() {
        return medida;
    }

    public void setMedia(Double medida) {
        this.medida = medida;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public Double getImagen() {
        return imagen;
    }

    public void setImagen(Double imagen) {
        this.imagen = imagen;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getMinimo() {
        return minimo;
    }

    public void setMinimo(Double minimo) {
        this.minimo = minimo;
    }
}
