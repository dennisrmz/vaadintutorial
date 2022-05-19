package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Estudiantes")
public class Estudiantes {
    @Id
    @Column(name = "estno", nullable = false)
    private Long estno;
    private String nombre;


    public Long getId() {
        return estno;
    }

    public void setId(Long id) {
        this.estno = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
