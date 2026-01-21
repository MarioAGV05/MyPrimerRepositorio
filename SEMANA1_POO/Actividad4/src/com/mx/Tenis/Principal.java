package com.mx.Tenis;

public class Principal {

    public static void main(String[] args) {

        ImpTenis imp = new ImpTenis();

        imp.create(new Tenis("Nike", "Air Force 1", 2600, "SERIE01"));
        imp.create(new Tenis("Adidas", "Forum", 2300, "SERIE02"));
        imp.create(new Tenis("Puma", "Roma", 1900, "SERIE03"));

        System.out.println("LISTA ORIGINAL");
        imp.read();
        System.out.println("Total de tenis: " + imp.contarTenis());

        Tenis tenisEditado = new Tenis("SERIE02");
        tenisEditado.setMarca("Adidas");
        tenisEditado.setModelo("Yeezy");
        tenisEditado.setPrecio(2500);

        imp.update(tenisEditado);

        System.out.println("\nLISTA DESPUÉS DE EDITAR");
        imp.read();
        System.out.println("Total de tenis: " + imp.contarTenis());

        imp.delete(new Tenis("SERIE01"));

        System.out.println("\nLISTA FINAL");
        imp.read();
        System.out.println("Total de tenis: " + imp.contarTenis());
    }
}