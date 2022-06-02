package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Beneficios")
public class Beneficios {
    @Id
    @SequenceGenerator(name="beneseq", sequenceName = "beneficio_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "beneseq")
    @Column(name = "idBeneficio")
    private Integer idBeneficio;

    @Column(name = "nombreBeneficio")
    private String nombreBeneficio;

    public Integer getIdBeneficio() {
        return this.idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public String getNombreBeneficio() {
        return this.nombreBeneficio;
    }

    public void setNombreBeneficio(String nombreBeneficio) {
        this.nombreBeneficio = nombreBeneficio;
    }
}
