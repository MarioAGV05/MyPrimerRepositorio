package com.mx.refrescos;

public class Principal {
    public static void main(String[] args) {

        // Crear instancia de la implementación
        Implementacion imp = new Implementacion();

        // Crear algunos refrescos
        Refresco r1 = new Refresco("Coca Cola", "Cola", "Coca-Cola", "Classic", "500ml", 15.0);
        Refresco r2 = new Refresco("Pepsi", "Cola", "Pepsi", "Regular", "600ml", 14.0);
        Refresco r3 = new Refresco("Fanta", "Naranja", "Coca-Cola", "Normal", "500ml", 12.5);

        // AGREGAR refrescos
        imp.create(0, r1);
        imp.create(1, r2);
        imp.create(5, r3); // índice fuera de rango -> se agrega al final automáticamente

        // LISTAR refrescos
        System.out.println("Lista inicial:");
        imp.read();

        // BUSCAR refresco en índice 1
        Refresco buscado = imp.buscar(1);
        if (buscado != null) {
            System.out.println("Refresco buscado en índice 1: " + buscado + "\n");
        }

        // ACTUALIZAR refresco en índice 0
        Refresco rNuevo = new Refresco("Coca Cola", "Cola", "Coca-Cola", "Zero", "500ml", 16.0);
        imp.update(0, rNuevo);

        // Listar después de actualizar
        System.out.println("Después de actualizar índice 0:");
        imp.read();

        // ELIMINAR refresco en índice 2
        imp.delete(2);

        // Listar después de eliminar
        System.out.println("Después de eliminar índice 2:");
        imp.read();
    }
}