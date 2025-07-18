package com.prueba.prueba.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-prueba")
@CrossOrigin
public class Controlador {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola mundo";
    }
}
