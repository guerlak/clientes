package com.guerlak.clientes.controller;


import com.guerlak.clientes.dto.ClienteDto;
import com.guerlak.clientes.entity.Cliente;
import com.guerlak.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {
ClienteService clienteService;
    ClienteController (ClienteService clienteService){
        this.clienteService = clienteService;
    }

    List<Cliente> clientes = new ArrayList<>();

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    @GetMapping
    public List<Cliente> welcome(){
         return getClientes();
    }

    @PostMapping("/um")
    public Cliente saveCliente(@RequestBody Cliente cliente){
        System.out.println(cliente.getId());
        return cliente;
    }

    //um metodo saveClienteDois recebe cliente dto um sout cliente id e o nome no sout retorna um clientedto

    @PostMapping
    public ClienteDto saveCliente(@RequestBody ClienteDto clienteDto){
       Cliente cliente = new Cliente(clienteDto.getId(), clienteDto.getName());
        addCliente(cliente);
        return clienteDto;
    }

    @PutMapping("/{id}")
    public ClienteDto updateCliente(@RequestBody ClienteDto clienteDto){
        Cliente newCliente = new Cliente(clienteDto.getId(), clienteDto.getName());
        int index = clientes.indexOf(getClienteById(clienteDto.getId()));
        System.out.println(index);
        clientes.set(index, newCliente);
        return clienteDto;
    }

    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable Long id){
        int index = clientes.indexOf(getClienteById(id));
        clientes.remove(index);
        return "OK";
    }

}
