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
@Table(name = "Catalogos_Productos_Proveedores")
public class Catalogos_Productos_Proveedores {
    @Id
    @SequenceGenerator(name="prov_seq", sequenceName = "proveedor_id_seq", allocationSize = 1) //Falta secuencia catalogo proveedor
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prov_seq")
    @Column(name = "idCatalogoProductosProveedor")
    private Integer idCatalogoProductosProveedor;
    
    @ManyToOne
    private Categorias_Proveedor idCatProveedor;

    @ManyToOne
    private Proveedores idProveedor;

    @Column(name = "nombreCatalogo")
    private String nombreCatalogo;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "precioDescuento")
    private Double precioDescuento;

    @Column(name = "garantia")
    private String garantia;

    @Column(name = "imagen")
    private Double imagen;

    public Integer getIdCatalogoProductosProveedor() {
        return this.idCatalogoProductosProveedor;
    }

    public void setIdCatalogoProductosProveedor(Integer idCatalogoProductosProveedor) {
        this.idCatalogoProductosProveedor = idCatalogoProductosProveedor;
    }

    public Categorias_Proveedor getIdCatProveedor() {
        return this.idCatProveedor;
    }

    public void setIdCatProveedor(Categorias_Proveedor idCatProveedor) {
        this.idCatProveedor = idCatProveedor;
    }

    public Proveedores getIdProveedor() {
        return this.idProveedor;
    }

    public void setIdProveedor(Proveedores idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreCatalogo() {
        return this.nombreCatalogo;
    }

    public void setNombreCatalogo(String nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecioDescuento() {
        return this.precioDescuento;
    }

    public void setPrecioDescuento(Double precioDescuento) {
        this.precioDescuento = precioDescuento;
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
}
