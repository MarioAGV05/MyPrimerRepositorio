package com.mx.Tenis;

import java.util.HashMap;

public class ImpTenis implements IMetodosTenis {

    HashMap<String, Tenis> listaTenis = new HashMap<>();

    @Override
    public void create(Tenis t) {
        listaTenis.put(t.numeroSerie, t);
    }

    @Override
    public void update(Tenis t) {

        Tenis existente = listaTenis.get(t.numeroSerie);

        if (existente != null) {
            existente.setMarca(t.marca);
            existente.setModelo(t.modelo);
            existente.setPrecio(t.precio);
        }
    }

    @Override
    public void delete(Tenis t) {
        listaTenis.remove(t.numeroSerie);
    }

    @Override
    public void read() {
        for (Tenis t : listaTenis.values()) {
            System.out.println(t);
        }
    }

    @Override
    public int contarTenis() {
        return listaTenis.size();
    }
}