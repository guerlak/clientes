package com.guerlak.clientes.service;

import com.guerlak.clientes.entity.Cliente;

import java.util.List;

public interface ClienteService {

    //getClienteById
    Cliente getClienteById(Long id);

    Cliente createCliente(Cliente cliente);

    List<Cliente> getAllCliente();

    Cliente updateCliente(Cliente cliente);

    void deleteCliente(Long id);
}

