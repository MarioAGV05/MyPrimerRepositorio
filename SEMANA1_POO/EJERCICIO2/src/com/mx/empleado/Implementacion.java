package com.mx.empleado;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos{
	
	//declaracion de una lista para agregar un elemento a los metodos declarados
	List<Empleado> lista = new ArrayList<Empleado>();

	@Override
	public void create(int indice, Empleado empleado) {
		lista.add(empleado);
		
	}

	@Override
	public void read() {
		System.out.println(lista);
		
	}

	@Override
	public void update(int indice, Empleado empleado) {
		lista.set(indice, empleado);
		
		
	}

	@Override
	public void delete(int indice) {
		lista.remove(indice);
		
	}

	@Override
	public Empleado buscar(int indice) {
		return lista.get(indice);
	} 
	
	//metodos personalizados
	public void contar() {
		System.out.println("Existen " + lista.size() + " Empleados registrados");
	}

}






















