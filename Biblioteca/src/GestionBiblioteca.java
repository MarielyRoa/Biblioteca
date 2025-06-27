
import java.util.ArrayList;
import java.util.List;

public class GestionBiblioteca {
    private static ArrayList<Libros> libros = new ArrayList<>();

    public static void AgregarLibro() {
        System.out.println("==========================");
        System.out.println("Agregar nuevos libros");
        System.out.println("==========================");

        System.out.println("Ingrese el nombre del libro: ");
        String nombre = Main.teclado.nextLine();
        System.out.println("Ingrese la categoria del libro: ");
        String categoria = Main.teclado.nextLine();
        System.out.println("Ingrese el año del libro: ");
        String anio = Main.teclado.nextLine();

        Libros libro = new Libros(nombre, categoria, anio);
        libros.add(libro);
        System.out.println("Libro agregado exitosamente!");
    }

    public static Libros buscarPorNombre(String nombre) {
        for (Libros libro : libros) {
            if (libro.getnombre().equalsIgnoreCase(nombre)) {
                return libro;
            }
        }
        return null;
    }

    public static void buscarPorCategoria() {
        System.out.println("Ingrese la categoría a buscar: ");
        String categoria = Main.teclado.nextLine();

        List<Libros> librosPorCategoria = new ArrayList<>();
        for (Libros libro : libros) {
            if (libro.getCategoria().equalsIgnoreCase(categoria)) {
                librosPorCategoria.add(libro);
            }
        }

        if (librosPorCategoria.isEmpty()) {
            System.out.println("No se encontraron libros con esa categoría.");
        } else {
            System.out.println("Libros encontrados:");
            for (Libros libro : librosPorCategoria) {
                System.out.println(libro);
            }
        }
    }


    public static void mostrarTodosLosLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        System.out.println("Lista de todos los libros:");
        System.out.println("==========================");
        for (Libros libro : libros) {
            System.out.println(libro);
        }
    }

    public static void buscarPorAnio() {
        System.out.println("Ingrese el año a buscar: ");
        String anio = Main.teclado.nextLine();

        List<Libros> librosPorAnio = new ArrayList<>();
        for (Libros libro : libros) {
            if (libro.getanio().equals(anio)) {
                librosPorAnio.add(libro);
            }
        }

        if (librosPorAnio.isEmpty()) {
            System.out.println("No se encontraron libros para ese año.");
        } else {
            System.out.println("Libros encontrados:");
            for (Libros libro : librosPorAnio) {
                System.out.println(libro);
            }
        }
    }


    public static void obtenerLibrosMasRecientes() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        String anioMasReciente = libros.get(0).getanio();
        for (Libros libro : libros) {
            if (Integer.parseInt(libro.getanio()) > Integer.parseInt(anioMasReciente)) {
                anioMasReciente = libro.getanio();
            }
        }

        List<Libros> librosRecientes = new ArrayList<>();
        for (Libros libro : libros) {
            if (libro.getanio().equals(anioMasReciente)) {
                librosRecientes.add(libro);
            }
        }

        System.out.println("Libros más recientes (año " + anioMasReciente + "):");
        for (Libros libro : librosRecientes) {
            System.out.println(libro);
        }
    }

}