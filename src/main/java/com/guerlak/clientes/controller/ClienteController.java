package com.guerlak.clientes.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {

    

    @GetMapping
    public String welcome(){
        return "hello world";
    }


}
