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

    @PostMapping
    public ClienteDto saveCliente(@RequestBody ClienteDto clienteDto){
        return new ClienteDto(clienteService.createCliente(new Cliente(clienteDto)));
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }

    @GetMapping
    public List<ClienteDto> getAllCliente(){
         return clienteService.getAllCliente()
                 .stream()
                 .map(ClienteDto::new)
                 .toList();
    }

    @GetMapping("/{id}")
    public ClienteDto getByClienteId(@PathVariable Long id){
        return new ClienteDto(clienteService.getClienteById(id));
    }

    @PostMapping("/um")
    public Cliente saveCliente(@RequestBody Cliente cliente){
        System.out.println(cliente.getId());
        return cliente;
    }

    @PutMapping("/{id}")
    public ClienteDto updateCliente(@PathVariable Long id, @RequestBody ClienteDto clienteDto){
        clienteDto.setId(id);
        return new ClienteDto(clienteService.updateCliente(new Cliente(clienteDto)));
    }
}
