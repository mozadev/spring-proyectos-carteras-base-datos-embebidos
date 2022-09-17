package com.example.proyartesperuanos;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarteraRepositorio extends CrudRepository <Cartera,Long> {

 List<Cartera>findByCODTIPCAR(Integer codTypoCart);

}
