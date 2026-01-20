package com.mx.empleado;

public class Principal {
	
	public static void main2(String args [] ) {
		
		Empleado emp1 = new Empleado("David", "Gonzalez", "Jimenez", 5884956825L, 58, 65000.13);
		Empleado emp2 = new Empleado("Jose", "Moreno", "Hernandez", 6598988525L, 50, 2500.13);
		Empleado emp3 = new Empleado("Axel", "Garcia", "Oropeza", 5478620158L, 45, 30000.50);
		Empleado emp4 = new Empleado("Jose", "Ramirez", "Diaz", 5568958572L, 38, 25000.60);
		Empleado emp5 = new Empleado("Rafael", "Medina", "Lopez", 5695854585L, 30, 40000.50);
		Empleado emp6 = new Empleado("Jose", "Anaya", "Sanchez", 5556522418L, 23, 20000.40);
		Empleado emp7 = new Empleado("Laura", "Hernandez", "Ruiz", 5635958574L, 32, 35000.20);
		
		Empleado empAux = null;
		
		Implementacion imp = new Implementacion();
		
		imp.create(1, emp1);
		imp.create(2, emp2);
		imp.create(3, emp3);
		imp.create(4, emp4);
		imp.create(5, emp5);
		imp.create(6, emp6);
		imp.create(7, emp7);
		
		
		imp.read();
		
		empAux = imp.buscar(1);
		System.out.println("Elemento encontrado: " + empAux );
		
		empAux = imp.buscar(1);
		empAux.setNombre("Julian");
		empAux.setSueldo(85);
		imp.update(1, emp1);
		System.out.println("Elemento encontrado: " + empAux);
		
		imp.delete(2);
		imp.read();
		
		imp.contar();
	}

}
