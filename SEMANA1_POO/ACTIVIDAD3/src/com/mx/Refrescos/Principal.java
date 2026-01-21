package com.mx.Refrescos;

public class Principal {

    public static void main1(String[] args) {

        Refresco ref1 = new Refresco("Coca Cola", "Cola", "Coca-Cola", "Classic", "600ml", 18);
        Refresco ref2 = new Refresco("Pepsi", "Cola", "Pepsi", "Regular", "600ml", 16);
        Refresco ref3 = new Refresco("Fanta", "Naranja", "Coca-Cola", "Normal", "500ml", 15);
        Refresco ref4 = new Refresco("Sprite", "Limon", "Coca-Cola", "Normal", "600ml", 17);
        Refresco ref5 = new Refresco("Manzanita", "Manzana", "Coca-Cola", "Normal", "600ml", 16);
        Refresco ref6 = new Refresco("7Up", "Limon", "Pepsi", "Normal", "600ml", 15);
        Refresco ref7 = new Refresco("Mirinda", "Naranja", "Pepsi", "Normal", "500ml", 14);

        Refresco refAux = null;

        Implementacion imp = new Implementacion();

        imp.create(1, ref1);
        imp.create(2, ref2);
        imp.create(3, ref3);
        imp.create(4, ref4);
        imp.create(5, ref5);
        imp.create(6, ref6);
        imp.create(7, ref7);

        System.out.println("\n===== LISTA DE REFRESCOS =====");
        imp.read();

        System.out.println("\n===== BUSCAR REFRESCO =====");
        refAux = imp.buscar(1);
        System.out.println("Elemento encontrado: " + refAux);

        System.out.println("\n===== ACTUALIZAR REFRESCO =====");
        refAux = imp.buscar(1);
        refAux.setSubmarca("Zero");
        refAux.setPrecio(20);
        imp.update(1, refAux);
        System.out.println("Elemento actualizado: " + refAux);

        System.out.println("\n===== ELIMINAR REFRESCO =====");
        imp.delete(2);

        System.out.println("\n===== LISTA FINAL =====");
        imp.read();
    }
}