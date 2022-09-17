package com.example.proyartesperuanos;

import javax.persistence.*;

@Entity
public class TipoCartera {
    @Id
    @GeneratedValue
    private Long id;
    private String NOMBTIPCAR;

    public TipoCartera(String NOMBTIPCAR) {
        this.NOMBTIPCAR = NOMBTIPCAR;
    }

    public TipoCartera() {
    }

    @Override
    public String toString() {
        return "TipoCartera{" +
                "id=" + id +
                ", NOMBTIPCAR='" + NOMBTIPCAR + '\'' +
                '}';
    }

    public String getNOMBTIPCAR() {
        return NOMBTIPCAR;
    }

    public void setNOMBTIPCAR(String NOMBTIPCAR) {
        this.NOMBTIPCAR = NOMBTIPCAR;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
