package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Personal_Clave")
public class Personal_Clave {
    @Id
    @SequenceGenerator(name="beneseq", sequenceName = "beneficio_id_seq", allocationSize = 1)//Falta secuencia
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "beneseq")
    @Column(name = "idPersonalClave")
    private Integer idPersonalClave;//Falta ManyToOne con proveedores

    @Column(name = "nombrePersonalClave")
    private String nombrePersonalClave;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "firma")
    private float firma;
}
