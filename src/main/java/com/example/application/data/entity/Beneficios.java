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
    @Column(name = "idbeneficio")
    private Integer idbeneficio;

    @Column(name = "nombrebeneficio")
    private String nombrebeneficio;

    public Integer getIdbeneficio() {
        return this.idbeneficio;
    }

    public void setIdbeneficio(Integer idbeneficio) {
        this.idbeneficio = idbeneficio;
    }

    public String getNombrebeneficio() {
        return this.nombrebeneficio;
    }

    public void setNombrebeneficio(String nombrebeneficio) {
        this.nombrebeneficio = nombrebeneficio;
    }
}
