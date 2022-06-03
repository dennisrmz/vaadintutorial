package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")
public class Productos {
    @Id
    @SequenceGenerator(name="produc_seq", sequenceName = "producto_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produc_seq")
    @Column(name = "idproducto")
    private Integer idproducto;
    
    @ManyToOne
    private Categorias_Producto idCatProducto;

    @ManyToOne
    private Unidades idUnidad;

    @ManyToOne
    private Inventarios idInventario;

    @ManyToOne
    private Marcas idMarca;//Relacion ManyToOne con Requisiciones

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
    private Integer cantidad;

    @Column(name = "minimo")
    private Integer minimo;

    public Integer getIdproducto() {
        return this.idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Categorias_Producto getIdCatProducto() {
        return this.idCatProducto;
    }

    public void setIdCatProducto(Categorias_Producto idCatProducto) {
        this.idCatProducto = idCatProducto;
    }

    public Unidades getIdUnidad() {
        return this.idUnidad;
    }

    public void setIdUnidad(Unidades idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Inventarios getIdInventario() {
        return this.idInventario;
    }

    public void setIdInventario(Inventarios idInventario) {
        this.idInventario = idInventario;
    }

    public Marcas getIdMarca() {
        return this.idMarca;
    }

    public void setIdMarca(Marcas idMarca) {
        this.idMarca = idMarca;
    }

    public Double getPrecioproducto() {
        return this.precioproducto;
    }

    public void setPrecioproducto(Double precioproducto) {
        this.precioproducto = precioproducto;
    }

    public String getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUtilidad() {
        return this.utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMedida() {
        return this.medida;
    }

    public void setMedida(Double medida) {
        this.medida = medida;
    }

    public String getGarantia() {
        return this.garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public Double getImagen() {
        return this.imagen;
    }

    public void setImagen(Double imagen) {
        this.imagen = imagen;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getMinimo() {
        return this.minimo;
    }

    public void setMinimo(Integer minimo) {
        this.minimo = minimo;
    }
}
