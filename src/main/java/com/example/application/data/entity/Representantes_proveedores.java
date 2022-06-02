package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "Representantes_Proveedores")
public class Representantes_proveedores {
    
    @Id
    @SequenceGenerator(name="repreprov_seq", sequenceName = "representante_proveedor_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "repreprov_seq")
    @Column(name = "idRepresentante")
    private Integer idRepresentante;

    @ManyToOne
    private Referencias_Bancarias referencia_bancaria;

    @Column(name = "nombreRepresentante")
    private String nombreRepresentante;

    @Column(name = "cargoRepresentante")
    private String cargo;

    @Column(name = "firmaRepresentante")
    private String firma;

    @Column(name = "telefonoRepresentante")
    private String telefono;

    @Email
    @Column(name = "emailRepresentante")
    private String email;


    public Integer getIdReprePro() {
        return this.idRepresentante;
    }

    public void setIdReprePro(Integer idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public String getNombreRepresentante() {
        return this.nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFirma() {
        return this.firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
