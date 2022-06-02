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
@Table(name = "Referencias_Bancarias")
public class Referencias_Bancarias {
    @Id
    @SequenceGenerator(name="refbank_seq", sequenceName = "referencia_bancaria_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refbank_seq")
    @Column(name = "idReferenciaBancaria")
    private Integer idReferenciaBancaria;

    //FK de Banco y Representante
    @ManyToOne
    private Bancos idBanco;

    @ManyToOne
    private Representantes_proveedores idRepresentante;

    @Column(name = "numeroCuenta")
    private String numeroCuenta;

    @Column(name = "tipoCuenta")
    private String tipoCuenta;


    public Integer getIdReferenciaBancaria() {
        return this.idReferenciaBancaria;
    }

    public void setIdReferenciaBancaria(Integer idReferenciaBancaria) {
        this.idReferenciaBancaria = idReferenciaBancaria;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Bancos getIdBanco() {
        return this.idBanco;
    }

    public void setIdBanco(Bancos idBanco) {
        this.idBanco = idBanco;
    }

    public Representantes_proveedores getIdRepresentante() {
        return this.idRepresentante;
    }

    public void setIdRepresentante(Representantes_proveedores idRepresentante) {
        this.idRepresentante = idRepresentante;
    }
}
