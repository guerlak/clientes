package com.guerlak.clientes.service;

import com.guerlak.clientes.entity.Cliente;

import java.util.List;

public interface ClienteService {

    //getClienteById
    Cliente getClienteById(Long id, List<Cliente> clientes);

    Cliente createCliente(Cliente cliente);

    List<Cliente> getAllCliente();

    Cliente updateCliente(Cliente cliente);

    boolean deleteCliente(Long id, List<Cliente> clientes);
}

