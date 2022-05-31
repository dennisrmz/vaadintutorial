package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Requisiciones")
public class Requisicion extends AbstractEntity{


    private String jefedepto = "";


    private LocalDate fechasolicitudr;


    private String anexo = "";


    private String solicitadapor = "";


    private LocalDate fechaentrega;


    private Double recibidopor = 1.1;


    private String detalleproductosnuevos = "";

    private LocalDate validahasta;


    public String getJefedepto() {
        return jefedepto;
    }

    public void setJefedepto(String jefedepto) {
        this.jefedepto = jefedepto;
    }

    public LocalDate getFechasolicitudr() {
        return fechasolicitudr;
    }

    public void setFechasolicitudr(LocalDate fechasolicitudr) {
        this.fechasolicitudr = fechasolicitudr;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String  getSolicitadapor() {
        return solicitadapor;
    }

    public void setSolicitadapor(String solicitadapor) {
        this.solicitadapor = solicitadapor;
    }

    public LocalDate getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(LocalDate fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Double getRecibidopor() {
        return recibidopor;
    }

    public void setRecibidopor(Double recibidopor) {
        this.recibidopor = recibidopor;
    }

    public String getDetalleproductosnuevos() {
        return detalleproductosnuevos;
    }

    public void setDetalleproductosnuevos(String detalleproductosnuevos) {
        this.detalleproductosnuevos = detalleproductosnuevos;
    }

    public LocalDate getValidahasta() {
        return validahasta;
    }

    public void setValidahasta(LocalDate validahasta) {
        this.validahasta = validahasta;
    }
}
