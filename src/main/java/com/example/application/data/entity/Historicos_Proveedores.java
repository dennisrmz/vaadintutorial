package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Historicos_Proveedores")
public class Historicos_Proveedores {
    @Id
    @SequenceGenerator(name="histo_seq", sequenceName = "historico_proveedor_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "histo_seq")
    @Column(name = "idHistoricoProveedor")
    private Integer idHistoricoProveedor;

    @Column(name = "valorNegocio")
    private String valorNegocio;

    @Column(name = "nombreContacto")
    private String nombreContacto;

    @Column(name = "nombreCompania")
    private String nombreCompania;

    public Integer getIdHistoricoProveedor() {
        return this.idHistoricoProveedor;
    }

    public void setIdHistoricoProveedor(Integer idHistoricoProveedor) {
        this.idHistoricoProveedor = idHistoricoProveedor;
    }

    public String getValorNegocio() {
        return this.valorNegocio;
    }

    public void setValorNegocio(String valorNegocio) {
        this.valorNegocio = valorNegocio;
    }

    public String getNombreContacto() {
        return this.nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNombreCompania() {
        return this.nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }
}
