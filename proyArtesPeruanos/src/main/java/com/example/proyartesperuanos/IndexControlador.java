package com.example.proyartesperuanos;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexControlador {


    @GetMapping("")
    public String index(){

        return "index";
    }


}
