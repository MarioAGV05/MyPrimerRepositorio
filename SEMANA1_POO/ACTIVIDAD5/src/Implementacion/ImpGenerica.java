package Implementacion;

import Principal.IMetodos;
import Entidades.Videojuego;
import java.util.ArrayList;
import java.util.List;

public class ImpGenerica implements IMetodos {

    protected List<Object> lista;

    public ImpGenerica() {
        lista = new ArrayList<>();
    }

    @Override
    public void create(Object key, Object value) {
        lista.add(value);
    }

    @Override
    public void read() {
        System.out.println("\nLista de videojuegos:");
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

    @Override
    public Object search(Object key) {
        for (Object obj : lista) {
            if (obj instanceof Videojuego) {
                Videojuego v = (Videojuego) obj;
                if (v.getNombre().equals(key)) {
                    return v;
                }
            }
        }
        return null;
    }

    @Override
    public void delete(Object key) {
        Object eliminar = null;
        for (Object obj : lista) {
            if (obj instanceof Videojuego) {
                Videojuego v = (Videojuego) obj;
                if (v.getNombre().equals(key)) {
                    eliminar = obj;
                    break;
                }
            }
        }
        if (eliminar != null) lista.remove(eliminar);
        else System.out.println("Videojuego no encontrado: " + key);
    }

    @Override
    public void update(Object key, Object value) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Videojuego) {
                Videojuego v = (Videojuego) lista.get(i);
                if (v.getNombre().equals(key)) {
                    lista.set(i, value);
                    System.out.println("Videojuego actualizado: " + value);
                    return;
                }
            }
        }
        System.out.println("Videojuego no encontrado: " + key);
    }
}
