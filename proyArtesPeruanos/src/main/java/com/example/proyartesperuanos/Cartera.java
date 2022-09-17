package com.example.proyartesperuanos;

import javax.persistence.*;

@Entity
public class Cartera {
    @Id
    @GeneratedValue
    private Long id;
    private String DESCRIPCAR;
    private String PRECIOCAR;
    private String FECHACAR;
    private Integer CODTIPCAR;

    @Override
    public String toString() {
        return "Cartera{" +
                "id=" + id +
                ", DESCRIPCAR='" + DESCRIPCAR + '\'' +
                ", PRECIOCAR='" + PRECIOCAR + '\'' +
                ", FECHACAR='" + FECHACAR + '\'' +
                ", CODTIPCAR=" + CODTIPCAR +
                '}';
    }

    public Cartera(String DESCRIPCAR, String PRECIOCAR, String FECHACAR, Integer CODTIPCAR) {
        this.DESCRIPCAR = DESCRIPCAR;
        this.PRECIOCAR = PRECIOCAR;
        this.FECHACAR = FECHACAR;
        this.CODTIPCAR = CODTIPCAR;
    }

    public Cartera() {
    }

    public String getDESCRIPCAR() {
        return DESCRIPCAR;
    }

    public void setDESCRIPCAR(String DESCRIPCAR) {
        this.DESCRIPCAR = DESCRIPCAR;
    }

    public String getPRECIOCAR() {
        return PRECIOCAR;
    }

    public void setPRECIOCAR(String PRECIOCAR) {
        this.PRECIOCAR = PRECIOCAR;
    }

    public String getFECHACAR() {
        return FECHACAR;
    }

    public void setFECHACAR(String FECHACAR) {
        this.FECHACAR = FECHACAR;
    }

    public Integer getCODTIPCAR() {
        return CODTIPCAR;
    }

    public void setCODTIPCAR(Integer CODTIPCAR) {
        this.CODTIPCAR = CODTIPCAR;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
