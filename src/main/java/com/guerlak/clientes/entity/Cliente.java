package com.guerlak.clientes.entity;

import com.guerlak.clientes.dto.ClienteDto;

public class Cliente {

    private Long id;
    private String name;

    public Cliente(){
    }

    public Cliente(Long id, String name){
        this.name = name;
        this.id = id;
    }

    public Cliente(ClienteDto clienteDto){
        this.id = clienteDto.getId();
        this.name = clienteDto.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
