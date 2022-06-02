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
@Table(name = "Proveedores")
public class Proveedores {
    @Id
    @SequenceGenerator(name="prov_seq", sequenceName = "proveedor_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prov_seq")
    @Column(name = "idProveedor")
    private Integer idProveedor;
    
    @ManyToOne
    private Establecimientos idCalificacion;//Algunas relaciones OneToOne

    @Column(name = "nombreCompania")
    private String nombreCompania;

    @Column(name = "representanteLegal")
    private String representanteLegal;

    @Column(name = "direccionProveedor")
    private String direccionProveedor;

    @Column(name = "numFijoProveedor")
    private String numFijoProveedor;

    @Column(name = "numMovilProveedor")
    private String numMovilProveedor;

    @Column(name = "correoElectronicoProveedor")
    private String correoElectronicoProveedor;

    @Column(name = "nombresContacto")
    private String nombresContacto;

    @Column(name = "sitioWeb")
    private String sitioWeb;

    @Column(name = "razonSocial")
    private String razonSocial;

    @Column(name = "activoProveedor")
    private Boolean activoProveedor;

    @Column(name = "nrc")
    private String nrc;

    @Column(name = "nit")
    private String nit;

    @Column(name = "anios")
    private Integer anios;

    @Column(name = "rubro")
    private String rubro;
}
