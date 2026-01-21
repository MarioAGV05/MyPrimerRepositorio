package com.mx.Refrescos;

import java.util.Scanner;

public class InteractivoRefrescos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Implementacion imp = new Implementacion();
        Refresco refAux = null;
        
        Refresco ref1 = new Refresco("Coca Cola", "Cola", "Coca-Cola", "Classic", "600ml", 18);
        Refresco ref2 = new Refresco("Pepsi", "Cola", "Pepsi", "Regular", "600ml", 16);
        Refresco ref3 = new Refresco("Fanta", "Naranja", "Coca-Cola", "Normal", "500ml", 15);
        Refresco ref4 = new Refresco("Sprite", "Limon", "Coca-Cola", "Normal", "600ml", 17);
        Refresco ref5 = new Refresco("Manzanita", "Manzana", "Coca-Cola", "Normal", "600ml", 16);
        Refresco ref6 = new Refresco("7Up", "Limon", "Pepsi", "Normal", "600ml", 15);
        Refresco ref7 = new Refresco("Mirinda", "Naranja", "Pepsi", "Normal", "500ml", 14);

        imp.create(0, ref1);
        imp.create(1, ref2);
        imp.create(2, ref3);
        imp.create(3, ref4);
        imp.create(4, ref5);
        imp.create(5, ref6);
        imp.create(6, ref7);

        int opcion = 0;
        int indice;

        do {
        	
        	try {

            System.out.println("\n===== MENU REFRESCOS =====");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Count");
            System.out.println("7. Clear");
            System.out.println("8. Exit");
            System.out.print("Elige una opcion: ");

            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {

                case 1: // CREATE
                    System.out.println("\n--- CREAR REFRESCO ---");

                    System.out.print("Nombre: ");
                    String nombre = scan.nextLine();

                    System.out.print("Sabor: ");
                    String sabor = scan.nextLine();

                    System.out.print("Marca: ");
                    String marca = scan.nextLine();

                    System.out.print("Submarca: ");
                    String submarca = scan.nextLine();

                    System.out.print("Tamaño: ");
                    String tamano = scan.nextLine();

                    System.out.print("Precio: ");
                    double precio = scan.nextDouble();

                    boolean duplicado = false;
                    for (int i = 0; i < imp.lista.size(); i++) {
                        Refresco r = imp.lista.get(i);
                        if (r.getNombre().equalsIgnoreCase(nombre)
                                && r.getMarca().equalsIgnoreCase(marca)) {
                            duplicado = true;
                            break;
                        }
                    }

                    if (duplicado) {
                        System.out.println("El refresco ya existe, no se permiten duplicados");
                    } else {
                        Refresco nuevo = new Refresco(nombre, sabor, marca, submarca, tamano, precio);
                        imp.create(imp.lista.size(), nuevo);
                        System.out.println("Refresco agregado correctamente");
                    }
                    break;

                case 2: // READ
                    System.out.println("\n--- LISTA DE REFRESCOS ---");
                    if (imp.lista.isEmpty()) {
                        System.out.println("No existen registros en la lista");
                    } else {
                        imp.read();
                    }
                    break;

                case 3: // UPDATE
                    System.out.println("\n--- ACTUALIZAR REFRESCO ---");
                    System.out.print("Indice a editar: ");
                    indice = scan.nextInt();
                    scan.nextLine();

                    refAux = imp.buscar(indice);

                    if (refAux == null) {
                        System.out.println("No existe el registro, no se puede editar");
                    } else {

                        //MOSTRAR INFORMACIÓN DEL REFRESCO
                        System.out.println("\nRefresco seleccionado:");
                        System.out.println(refAux);

                        int opcionEditar = 0;

                        do {
                            System.out.println("\n--- SUBMENU EDITAR ---");
                            System.out.println("1. Editar Nombre");
                            System.out.println("2. Editar Sabor");
                            System.out.println("3. Editar Marca");
                            System.out.println("4. Editar Submarca");
                            System.out.println("5. Editar Tamaño");
                            System.out.println("6. Editar Precio");
                            System.out.println("7. Regresar");
                            System.out.print("Elige una opcion: ");

                            opcionEditar = scan.nextInt();
                            scan.nextLine();

                            switch (opcionEditar) {

                                case 1: // EDITAR NOMBRE
                                    System.out.print("Nuevo nombre: ");
                                    String nuevoNombre = scan.nextLine();

                                    boolean dupNombre = false;
                                    for (int i = 0; i < imp.lista.size(); i++) {
                                        if (i != indice) {
                                            Refresco r = imp.lista.get(i);
                                            if (r.getNombre().equalsIgnoreCase(nuevoNombre)
                                                    && r.getMarca().equalsIgnoreCase(refAux.getMarca())) {
                                                dupNombre = true;
                                                break;
                                            }
                                        }
                                    }

                                    if (dupNombre) {
                                        System.out.println("Ya existe un refresco con ese nombre y marca");
                                    } else {
                                        refAux.setNombre(nuevoNombre);
                                        imp.update(indice, refAux);
                                        System.out.println("Nombre actualizado");
                                    }
                                    break;

                                case 2: // EDITAR SABOR
                                    System.out.print("Nuevo sabor: ");
                                    refAux.setSabor(scan.nextLine());
                                    imp.update(indice, refAux);
                                    System.out.println("Sabor actualizado");
                                    break;

                                case 3: // EDITAR MARCA
                                    System.out.print("Nueva marca: ");
                                    String nuevaMarca = scan.nextLine();

                                    boolean dupMarca = false;
                                    for (int i = 0; i < imp.lista.size(); i++) {
                                        if (i != indice) {
                                            Refresco r = imp.lista.get(i);
                                            if (r.getNombre().equalsIgnoreCase(refAux.getNombre())
                                                    && r.getMarca().equalsIgnoreCase(nuevaMarca)) {
                                                dupMarca = true;
                                                break;
                                            }
                                        }
                                    }

                                    if (dupMarca) {
                                        System.out.println("Ya existe un refresco con ese nombre y marca");
                                    } else {
                                        refAux.setMarca(nuevaMarca);
                                        imp.update(indice, refAux);
                                        System.out.println("Marca actualizada");
                                    }
                                    break;

                                case 4: // EDITAR SUBMARCA
                                    System.out.print("Nueva submarca: ");
                                    refAux.setSubmarca(scan.nextLine());
                                    imp.update(indice, refAux);
                                    System.out.println("Submarca actualizada");
                                    break;

                                case 5: // EDITAR TAMAÑO
                                    System.out.print("Nuevo tamaño: ");
                                    refAux.setTamano(scan.nextLine());
                                    imp.update(indice, refAux);
                                    System.out.println("Tamaño actualizado");
                                    break;

                                case 6: // EDITAR PRECIO
                                    System.out.print("Nuevo precio: ");
                                    refAux.setPrecio(scan.nextDouble());
                                    scan.nextLine();
                                    imp.update(indice, refAux);
                                    System.out.println("Precio actualizado");
                                    break;

                                case 7:
                                    System.out.println("Regresando al menú principal...");
                                    break;

                                default:
                                    System.out.println("Opción no válida");
                            }

                        } while (opcionEditar != 7);
                    }
                    break;

                case 4: // DELETE POR NOMBRE

                    if (imp.lista.isEmpty()) {
                        System.out.println("La lista está vacía, no hay refrescos para eliminar");
                        break;
                    }

                    scan.nextLine(); 
                    System.out.print("Ingresa el nombre del refresco a eliminar: ");
                    String nombreEliminar = scan.nextLine().trim();

                    int indiceEliminar = -1;
                    Refresco refAux1 = null;

                    for (int i = 0; i < imp.lista.size(); i++) {
                        Refresco r = imp.lista.get(i);

                        if (r.getNombre().equalsIgnoreCase(nombreEliminar)) {
                            indiceEliminar = i;
                            refAux1 = r;
                            break;
                        }
                    }

                    if (indiceEliminar == -1) {
                        System.out.println("No existe un refresco con ese nombre");
                        break;
                    }

                    System.out.println("\nRefresco encontrado:");
                    System.out.println("Nombre: " + refAux1.getNombre());
                    System.out.println("Marca: " + refAux1.getMarca());
                    System.out.println("Sabor: " + refAux1.getSabor());
                    System.out.println("Tamaño: " + refAux1.getTamano());
                    System.out.println("Precio: $" + refAux1.getPrecio());

                    boolean respuestaValida = false;

                    do {
                        System.out.print("\n¿Deseas eliminar este refresco? (si / no): ");
                        String confirmacion = scan.nextLine().trim().toLowerCase();

                        if (confirmacion.equals("si")) {
                            imp.delete(indiceEliminar);
                            System.out.println("Refresco eliminado correctamente");
                            respuestaValida = true;
                        } 
                        else if (confirmacion.equals("no")) {
                            System.out.println("Eliminación cancelada");
                            respuestaValida = true;
                        } 
                        else {
                            System.out.println("Opción inválida, escribe únicamente 'si' o 'no'");
                        }

                    } while (!respuestaValida);

                    break;
                
                case 5: // SEARCH POR NOMBRE

                    if (imp.lista.isEmpty()) {
                        System.out.println("La lista está vacía, no hay refrescos para buscar");
                        break;
                    }

                    scan.nextLine(); // limpiar buffer
                    System.out.print("Ingresa el nombre del refresco a buscar: ");
                    String nombreBuscar = scan.nextLine().trim();

                    Refresco refAux11 = null;

                    for (int i = 0; i < imp.lista.size(); i++) {
                        Refresco r = imp.lista.get(i);

                        if (r.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            refAux11 = r;
                            break;
                        }
                    }

                    if (refAux11 == null) {
                        System.out.println("No existe un refresco con ese nombre");
                    } else {
                        System.out.println("\nRefresco encontrado");
                        System.out.println("----------------------------");
                        System.out.println("Nombre   : " + refAux11.getNombre());
                        System.out.println("Marca    : " + refAux11.getMarca());
                        System.out.println("Submarca : " + refAux11.getSubmarca());
                        System.out.println("Sabor    : " + refAux11.getSabor());
                        System.out.println("Tamaño   : " + refAux11.getTamano());
                        System.out.println("Precio   : $" + refAux11.getPrecio());
                        System.out.println("----------------------------");
                    }

                    break;

                case 6: // COUNT
                    System.out.println("\n--- CONTAR REFRESCOS ---");
                    if (imp.lista.isEmpty()) {
                        System.out.println("La lista está vacía");
                    } else {
                        System.out.println("Total de refrescos: " + imp.lista.size());
                    }
                    break;

                case 7: // CLEAR
                    System.out.println("\n--- LIMPIAR LISTA ---");
                    imp.lista.clear();
                    System.out.println("Lista vaciada correctamente");
                    break;

                case 8: // EXIT
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida... Porfavor ingresa una opción del menú");
            }
            
        	 } catch (Exception e) {
        	        System.out.println("Error en la entrada de datos");
        	        scan.nextLine();
        	    }

        } while (opcion != 8);

        scan.close();
    }
}
