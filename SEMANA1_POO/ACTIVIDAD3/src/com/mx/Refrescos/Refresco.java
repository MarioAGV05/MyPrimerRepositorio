package com.mx.Refrescos;

public class Refresco {

    private String nombre;
    private String sabor;
    private String marca;
    private String submarca;
    private String tamano;
    private double precio;

    public Refresco() {
    }

    public Refresco(String nombre, String sabor, String marca, String submarca, String tamano, double precio) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.marca = marca;
        this.submarca = submarca;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Refresco [nombre=" + nombre + ", sabor=" + sabor + ", marca=" + marca +
                ", submarca=" + submarca + ", tamaño=" + tamano + ", precio=" + precio + "]";
    }
}         