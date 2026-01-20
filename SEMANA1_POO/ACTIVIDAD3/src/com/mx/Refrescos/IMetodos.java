package com.mx.Refrescos;

public interface IMetodos {

    public void create(int indice, Refresco refresco);

    public void read();

    public void update(int indice, Refresco refresco);

    public void delete(int indice);

    public Refresco buscar(int indice);
}
