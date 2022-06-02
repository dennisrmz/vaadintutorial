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
@Table(name = "Imagenes_Establecimientos")
public class Imagenes_Establecimientos {
    @Id
    @SequenceGenerator(name="img_seq", sequenceName = "imagen_establecimiento_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "img_seq")
    @Column(name = "idImagenEstablecimiento")
    private Integer idImagenEstablecimiento;
    
    @ManyToOne
    private Establecimientos idEstablecimiento;

    @Column(name = "nombreImagenEstablecimiento")
    private String nombreImagenEstablecimiento;

    public Establecimientos getIdEstablecimiento() {
        return this.idEstablecimiento;
    }

    public void setIdEstablecimiento(Establecimientos idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    public Integer getIdImagenEstablecimiento() {
        return this.idImagenEstablecimiento;
    }

    public void setIdImagenEstablecimiento(Integer idImagenEstablecimiento) {
        this.idImagenEstablecimiento = idImagenEstablecimiento;
    }

    public String getNombreImagenEstablecimiento() {
        return this.nombreImagenEstablecimiento;
    }

    public void setNombreImagenEstablecimiento(String nombreImagenEstablecimiento) {
        this.nombreImagenEstablecimiento = nombreImagenEstablecimiento;
    }
}
