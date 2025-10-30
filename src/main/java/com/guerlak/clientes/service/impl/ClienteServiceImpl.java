package com.guerlak.clientes.service.impl;

import com.guerlak.clientes.entity.Cliente;
import com.guerlak.clientes.service.ClienteService;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {
    @Override
    public Cliente getClienteById(Long id) {

        for(Cliente cliente: clientes){
            if(cliente.getId().equals(id)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public List<Cliente> getAllCliente() {
        return List.of();
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return null;
    }

    @Override
    public boolean deleteCliente(Long id, List<Cliente> clientes) {
        int index = clientes.indexOf(getClienteById(id));
        clientes.remove(index);
        return true;
    }
}
