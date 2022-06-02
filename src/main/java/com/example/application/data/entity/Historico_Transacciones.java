package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Historico_Transacciones")
public class Historico_Transacciones {
    @Id
    @SequenceGenerator(name="histotrans_seq", sequenceName = "historico_transacciones_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "histotrans_seq")
    @Column(name = "idHistoricoTransaccion")
    private Integer idHistoricoTransaccion;//Falta ManyToOne con Proveedores

    @Column(name = "nombreCompaniaTrans")
    private String nombreCompaniaTrans;

    @Column(name = "valorNegocio")
    private String valorNegocio;

    @Column(name = "nomContactoTrans")
    private String nomContactoTrans;

    @Column(name = "telContactoTrans")
    private String telContactoTrans;

    public Integer getIdHistoricoTransaccion() {
        return this.idHistoricoTransaccion;
    }

    public void setIdHistoricoTransaccion(Integer idHistoricoTransaccion) {
        this.idHistoricoTransaccion = idHistoricoTransaccion;
    }

    public String getNombreCompaniaTrans() {
        return this.nombreCompaniaTrans;
    }

    public void setNombreCompaniaTrans(String nombreCompaniaTrans) {
        this.nombreCompaniaTrans = nombreCompaniaTrans;
    }

    public String getValorNegocio() {
        return this.valorNegocio;
    }

    public void setValorNegocio(String valorNegocio) {
        this.valorNegocio = valorNegocio;
    }

    public String getNomContactoTrans() {
        return this.nomContactoTrans;
    }

    public void setNomContactoTrans(String nomContactoTrans) {
        this.nomContactoTrans = nomContactoTrans;
    }

    public String getTelContactoTrans() {
        return this.telContactoTrans;
    }

    public void setTelContactoTrans(String telContactoTrans) {
        this.telContactoTrans = telContactoTrans;
    }
}
