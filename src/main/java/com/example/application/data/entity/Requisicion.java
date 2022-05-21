package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name="Requisiciones")
public class Requisicion{

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotEmpty
    private String jefeDepto = "";

    @NotEmpty
    private String fechaSolicitudR = "";

    @NotEmpty
    private String anexo = "";

    @NotEmpty
    private Integer solicitudaPor = -1;

    @NotEmpty
    private String fechaEntrega = "";

    @NotEmpty
    private Integer recibidoPor = -1;

    @NotEmpty
    private String detalleProductosNuevos = "";

    @NotEmpty
    @Type(type="date")
    private Date validaHasta;



    public String getJefeDepto() {
        return jefeDepto;
    }

    public void setJefeDepto(String jefeDepto) {
        this.jefeDepto = jefeDepto;
    }

    public String getFechaSolicitudR() {
        return fechaSolicitudR;
    }

    public void setFechaSolicitudR(String fechaSolicitudR) {
        this.fechaSolicitudR = fechaSolicitudR;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public Integer getSolicitudaPor() {
        return solicitudaPor;
    }

    public void setSolicitudaPor(Integer solicitudaPor) {
        this.solicitudaPor = solicitudaPor;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getRecibidoPor() {
        return recibidoPor;
    }

    public void setRecibidoPor(Integer recibidoPor) {
        this.recibidoPor = recibidoPor;
    }

    public String getDetalleProductosNuevos() {
        return detalleProductosNuevos;
    }

    public void setDetalleProductosNuevos(String detalleProductosNuevos) {
        this.detalleProductosNuevos = detalleProductosNuevos;
    }

    public Date getValidaHasta() {
        return validaHasta;
    }

    public void setValidaHasta(Date validaHasta) {
        this.validaHasta = validaHasta;
    }
}
