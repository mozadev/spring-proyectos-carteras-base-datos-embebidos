package com.example.proyartesperuanos;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/cartera")
public class CarteraControlador {


    private final Logger LOGGER = LoggerFactory.getLogger(CarteraControlador.class);

    @Autowired
    private CarteraRepositorio carteraRepositorio;

    @Autowired// notation of orm that allow to define a reference of repository interface
    private TipoCarteraRepositorio tipoCarteraRepositorio;

//    @GetMapping("")
//    public String show() {
//        return "carteras/consultarCarteraManual";
//    }

    @GetMapping("consultarCarteraManual")
    public String show(Model model) { // model post inf from backend for view
        model.addAttribute("listaTipoCartera", tipoCarteraRepositorio.findAll());
        return "consultarCarteraManual";
    }

    @GetMapping("registrarCarteraManual")
    public String show2(Model model) { // model post inf from backend for view
        model.addAttribute("listaTipoCartera", tipoCarteraRepositorio.findAll());
        return "registrarCarteraManual";
    }

    @PostMapping("/save")
    public String save(Cartera cartera, Model model) {
        LOGGER.info("este es el objeto cartera {}", cartera);
        carteraRepositorio.save(cartera);
        model.addAttribute("mensaje","Se grabo con exito");
        model.addAttribute("listaTipoCartera", tipoCarteraRepositorio.findAll());
        return "registrarCarteraManual"; //peticion
//        return "redirect:/cartera/registrarCarteraManual"; //peticion

    }

    @PostMapping("/search")
    public String search(@RequestParam Integer CODTIPCAR, Model model) {
//        LOGGER.info("este es el codigo  buscado cartera {}",CODTIPCAR);
        List<Cartera> carteras = carteraRepositorio.findByCODTIPCAR(CODTIPCAR);
        model.addAttribute("listaCarteraBuscada", carteras);
        model.addAttribute("listaTipoCartera", tipoCarteraRepositorio.findAll());
        return "consultarCarteraManual";

    }


}

