package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Bancos")
public class Bancos {
    @Id
    @SequenceGenerator(name="bankseq", sequenceName = "bancos_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bankseq")
    @Column(name = "idbanco")
    private Integer idbanco;

    @Column(name = "nombrebanco")
    private String nombrebanco;

    public Integer getIdbanco() {
        return this.idbanco;
    }

    public void setIdbanco(Integer idbanco) {
        this.idbanco = idbanco;
    }

    public String getNombrebanco() {
        return this.nombrebanco;
    }

    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }
}
