package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Calidad_Proveedores")
public class Calidad_Proveedores {
    @Id
    @SequenceGenerator(name="cali_pro_seq", sequenceName = "calidadproveedor_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cali_pro_seq")
    @Column(name = "idcalidad")
    private Integer idcalidad;

    @Column(name = "nombrecalidad")
    private String nombrecalidad;
}
