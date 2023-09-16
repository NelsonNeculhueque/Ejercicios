import java.util.Random;

class Playlist {
    private String nombre;
    private String[] canciones;
    private String estado;
    private int indiceReproduccion;

    public Playlist(String nombre, int capacidad) {
        this.nombre = nombre;
        this.canciones = new String[capacidad];
        this.estado = "detenido";
        this.indiceReproduccion = -1;
    }

    public void añadirCancion(String cancion) {
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] == null) {
                canciones[i] = cancion;
                System.out.println("Canción agregada: " + cancion);
                return;
            }
        }
        System.out.println("La lista de reproducción está llena, no se pudo agregar la canción.");
    }

    public void eliminarCancion(String cancion) {
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null && canciones[i].equals(cancion)) {
                canciones[i] = null;
                System.out.println("Canción eliminada: " + cancion);
                return;
            }
        }
        System.out.println("Canción no encontrada en la lista de reproducción.");
    }

    public void mostrarCanciones() {
        System.out.println("Lista de reproducción '" + nombre + "':");
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                System.out.println((i + 1) + ". " + canciones[i]);
            }
        }
    }

    public void reproducir() {
        if (estado.equals("detenido")) {
            if (canciones[0] != null) {
                estado = "reproduciendo";
                indiceReproduccion = 0;
                System.out.println("Reproduciendo: " + canciones[indiceReproduccion]);
            } else {
                System.out.println("La lista de reproducción está vacía.");
            }
        } else if (estado.equals("pausa")) {
            estado = "reproduciendo";
            System.out.println("Reanudando la reproducción de: " + canciones[indiceReproduccion]);
        } else {
            System.out.println("La lista de reproducción ya se está reproduciendo.");
        }
    }

    public void seleccionarCancion(int indice) {
        if (indice >= 0 && indice < canciones.length && canciones[indice] != null) {
            estado = "reproduciendo";
            indiceReproduccion = indice;
            System.out.println("Reproduciendo: " + canciones[indiceReproduccion]);
        } else {
            System.out.println("Índice de canción inválido.");
        }
    }

    public void pausar() {
        if (estado.equals("reproduciendo")) {
            estado = "pausa";
            System.out.println("Pausando la reproducción de: " + canciones[indiceReproduccion]);
        } else {
            System.out.println("No se puede pausar, la lista de reproducción no se está reproduciendo.");
        }
    }

    public void detener() {
        if (estado.equals("reproduciendo")) {
            estado = "detenido";
            indiceReproduccion = -1;
            System.out.println("Deteniendo la reproducción.");
        } else {
            System.out.println("La lista de reproducción ya está detenida.");
        }
    }

    public void siguienteCancion() {
        if (estado.equals("reproduciendo")) {
            if (indiceReproduccion < canciones.length - 1 && canciones[indiceReproduccion + 1] != null) {
                indiceReproduccion++;
                System.out.println("Reproduciendo siguiente canción: " + canciones[indiceReproduccion]);
            } else {
                System.out.println("No hay más canciones disponibles.");
                detener();
            }
        } else {
            System.out.println("No se puede reproducir la siguiente canción, la lista de reproducción no se está reproduciendo.");
        }
    }

    public void cancionAnterior() {
        if (estado.equals("reproduciendo")) {
            if (indiceReproduccion > 0) {
                indiceReproduccion--;
                System.out.println("Reproduciendo canción anterior: " + canciones[indiceReproduccion]);
            } else {
                System.out.println("No hay canciones anteriores disponibles.");
            }
        } else {
            System.out.println("No se puede reproducir la canción anterior, la lista de reproducción no se está reproduciendo.");
        }
    }

    public void reproducirCancionAleatoria() {
        if (estado.equals("detenido")) {
            Random rand = new Random();
            int randomIndex;
            do {
                randomIndex = rand.nextInt(canciones.length);
            } while (canciones[randomIndex] == null || randomIndex == indiceReproduccion);

            seleccionarCancion(randomIndex);
        } else {
            System.out.println("No se puede reproducir una canción aleatoria, la lista de reproducción ya se está reproduciendo.");
        }
    }

    public void verEstado() {
        System.out.println("Estado de la lista de reproducción: " + estado);
    }

    public void verCancionActual() {
        if (indiceReproduccion >= 0 && indiceReproduccion < canciones.length && canciones[indiceReproduccion] != null) {
            System.out.println("Canción actual: " + canciones[indiceReproduccion]);
        } else {
            System.out.println("No hay canción en reproducción.");
        }
    }
}

public class ReproductorDeSonido {
    public static void main(String[] args) {
        Playlist miplaylist = new Playlist("Mi Playlist", 10);

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Añadir canción");
            System.out.println("2. Eliminar canción");
            System.out.println("3. Mostrar canciones");
            System.out.println("4. Reproducir");
            System.out.println("5. Seleccionar canción");
            System.out.println("6. Pausar");
            System.out.println("7. Detener");
            System.out.println("8. Siguiente canción");
            System.out.println("9. Canción anterior");
            System.out.println("10. Reproducir canción aleatoria");
            System.out.println("11. Ver estado");
            System.out.println("12. Ver canción actual");
            System.out.println("13. Salir");

            int opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    String nuevaCancion = leerCadena("Ingrese el nombre de la canción: ");
                    miplaylist.añadirCancion(nuevaCancion);
                    break;
                case 2:
                    String cancionAEliminar = leerCadena("Ingrese el nombre de la canción a eliminar: ");
                    miplaylist.eliminarCancion(cancionAEliminar);
                    break;
                case 3:
                    miplaylist.mostrarCanciones();
                    break;
                case 4:
                    miplaylist.reproducir();
                    break;
                case 5:
                    int indiceCancion = leerEntero("Ingrese el índice de la canción a seleccionar: ");
                    miplaylist.seleccionarCancion(indiceCancion - 1);
                    break;
                case 6:
                    miplaylist.pausar();
                    break;
                case 7:
                    miplaylist.detener();
                    break;
                case 8:
                    miplaylist.siguienteCancion();
                    break;
                case 9:
                    miplaylist.cancionAnterior();
                    break;
                case 10:
                    miplaylist.reproducirCancionAleatoria();
                    break;
                case 11:
                    miplaylist.verEstado();
                    break;
                case 12:
                    miplaylist.verCancionActual();
                    break;
                case 13:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        }
    }

    public static String leerCadena(String mensaje) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static int leerEntero(String mensaje) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }
}