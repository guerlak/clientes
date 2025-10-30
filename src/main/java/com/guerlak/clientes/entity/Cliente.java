package com.guerlak.clientes.entity;

public class Cliente {

    private Long id;
    private String name;

    public Cliente(){
    }

    public Cliente(Long id, String name){
        this.name = name;
        this.id = id;
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
