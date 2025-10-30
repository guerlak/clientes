package com.guerlak.clientes.service.impl;

import com.guerlak.clientes.entity.Cliente;
import com.guerlak.clientes.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public Cliente getClienteById(Long id) {
        //persistir no banco
        System.out.println("id que sera deletado " + id);
        return new Cliente();
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        //persistir no banco
        System.out.println(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> getAllCliente() {
        return List.of();
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        //persistir no banco
        System.out.println(cliente);
        return cliente;
    }

    @Override
    public void deleteCliente(Long id) {
        //persistir no banco
        System.out.println("id que sera deletado " + id);
    }
}
