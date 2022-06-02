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
@Table(name = "Referencias_Comerciales")
public class Referencias_Comerciales {
    @Id
    @SequenceGenerator(name="refcome_seq", sequenceName = "referencia_comercial_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refcome_seq")
    @Column(name = "idRefereciaComercial")
    private Integer idRefereciaComercial;

    //FK de Representante
    @ManyToOne
    private Representantes_proveedores idRepresentante;

    @Column(name="nombreCompania")
    private String nombreCompania;

    @Column(name="nombreContacto")
    private String nombreContacto;

    @Column(name="telefonoContacto")
    private String telefonoContacto;

    public Integer getIdRefereciaComercial() {
        return this.idRefereciaComercial;
    }

    public void setIdRefereciaComercial(Integer idRefereciaComercial) {
        this.idRefereciaComercial = idRefereciaComercial;
    }

    public Representantes_proveedores getIdRepresentante() {
        return this.idRepresentante;
    }

    public void setIdRepresentante(Representantes_proveedores idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public String getNombreCompania() {
        return this.nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public String getNombreContacto() {
        return this.nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefonoContacto() {
        return this.telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
}
