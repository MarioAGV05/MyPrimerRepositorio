package Principal;

import Entidades.Videojuego;
import Implementacion.ImpVideojuego;

public class Principal {

    public static void main(String[] args) {

        ImpVideojuego impV = new ImpVideojuego();

        Videojuego v1 = new Videojuego(1, "Minecraft", "Aventura", "Mojang", "Todos");
        Videojuego v2 = new Videojuego(2, "FIFA 24", "Deportes", "EA Sports", "Todos");
        Videojuego v3 = new Videojuego(3, "Call of Duty", "Acción", "Activision", "18+");
        Videojuego v4 = new Videojuego(4, "Zelda", "Aventura", "Nintendo", "12+");
        Videojuego v5 = new Videojuego(5, "Among Us", "Multijugador", "InnerSloth", "Todos");

        // Crear
        impV.create(v1.getNombre(), v1);
        impV.create(v2.getNombre(), v2);
        impV.create(v3.getNombre(), v3);
        impV.create(v4.getNombre(), v4);
        impV.create(v5.getNombre(), v5);

        // Leer
        impV.read();

        // Buscar
        Videojuego aux = (Videojuego) impV.search("Zelda");
        System.out.println("\nEncontrado: " + aux);

        // Eliminar
        impV.delete("Zelda");
        impV.read();

        // Contar
        impV.contar();

        // Editar 
        Videojuego nuevoFIFA = new Videojuego(2, "FIFA 26", "Futbol", "EA Sports", "Todos+");
        impV.update("FIFA 24", nuevoFIFA);
        impV.read();
    }
}
