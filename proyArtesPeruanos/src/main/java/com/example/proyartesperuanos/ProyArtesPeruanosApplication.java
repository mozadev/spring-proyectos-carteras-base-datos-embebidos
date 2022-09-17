package com.example.proyartesperuanos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProyArtesPeruanosApplication implements CommandLineRunner {


    @Autowired// notation of orm that allow to define a reference of repository interface
    private TipoCarteraRepositorio tipoCarteraRepositorio;


    @Autowired// notation of orm that allow to define a reference of repository interface
    private CarteraRepositorio carteraRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(ProyArtesPeruanosApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        //        System.out.println("hola mundo 2");edx
        //InsertTipoCartera();
        //ListTipoCartera();
        // BuscarEmpleadoid(3L);
        //repository.deleteAll();
        //System.out.println(repository.findByApellidoContaining(""));
//        System.out.println(carteraRepositorio.findByCODTIPCAR(4));
    }


    public void InsertTipoCartera(){

        tipoCarteraRepositorio.save(new TipoCartera("ANDINO"));
        tipoCarteraRepositorio.save(new TipoCartera("TRADICIONAL"));
        tipoCarteraRepositorio.save(new TipoCartera("SELVATICO"));
        tipoCarteraRepositorio.save(new TipoCartera("COSTEÑO"));
    }
    public void ListTipoCartera(){

        System.out.println(tipoCarteraRepositorio.findAll());
    }


//    public List Busqueda(int id) {
//        return null;
//
//    }
//


//
//    public int InsertarTipoCartera(String nombre, String precio, String fecha, int idTipoCartera) {
//
//        return 1;
//
//    }
//
//    public List CargarComboTipoCartera(){
//        return null;
//
//    }


}


