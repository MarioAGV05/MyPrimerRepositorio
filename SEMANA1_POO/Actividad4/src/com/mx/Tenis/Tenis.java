package com.mx.Tenis;

public class Tenis {

    String marca;
    String modelo;
    double precio;
    String numeroSerie;

    public Tenis(String marca, String modelo, double precio, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.numeroSerie = numeroSerie;
    }

    public Tenis(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return marca + " | " + modelo + " | $" + precio + " | Serie: " + numeroSerie;
    }
}
