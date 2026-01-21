package com.mx.Refrescos;

import java.util.ArrayList;

public class Implementacion implements IMetodos {

    ArrayList<Refresco> lista = new ArrayList<>();
    Refresco empAux;

    @Override
    public void create(int indice, Refresco refresco) {
        if (indice >= 0 && indice <= lista.size()) {
            lista.add(indice, refresco);
        } else {
            lista.add(refresco);
        }
    }

    @Override
    public void read() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }
    }

    @Override
    public void update(int indice, Refresco refresco) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, refresco);
        }
    }

    @Override
    public void delete(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        }
    }

    @Override
    public Refresco buscar(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            empAux = lista.get(indice);
            return empAux;
        }
        return null;
    }
}