package com.mx.refrescos;

import java.util.ArrayList;

public class Implementacion implements IMetodos {

    public ArrayList<Refresco> lista = new ArrayList<>();

    @Override
    public void create(int indice, Refresco refresco) {
        if(indice >= 0 && indice <= lista.size()) {
            lista.add(indice, refresco);
        } else {
            lista.add(refresco);
        }
    }

    @Override
    public void read() {
        System.out.println("--- Lista de Refrescos ---");
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }
        System.out.println();
    }

    @Override
    public void update(int indice, Refresco refresco) {
        if(indice >= 0 && indice < lista.size()) {
            lista.set(indice, refresco);
        } else {
            System.out.println("Índice inválido para actualizar: " + indice);
        }
    }

    @Override
    public void delete(int indice) {
        if(indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        } else {
            System.out.println("Índice inválido para eliminar: " + indice);
        }
    }

    @Override
    public Refresco buscar(int indice) {
        if(indice >= 0 && indice < lista.size()) {
            return lista.get(indice);
        }
        return null;
    }
}