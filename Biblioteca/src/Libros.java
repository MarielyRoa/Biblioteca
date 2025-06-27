//Entidad Libros
//Atributo 1: Nombre
//Atributo 2: Categoria
//Atributo 3: Anio

public class Libros {


    private String nombre, categoria, anio;

    public Libros(String nombre, String categoria, String anio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.anio = anio;
    }

    // Métodos getters
    public String getnombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getanio() {
        return anio;
    }

    // Métodos setters
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setanio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libros{" + "Nombre: '" + nombre + '\'' +
                ", Categoria: '" + categoria + '\'' +
                ", Año: '" + anio + '\'' +
                '}';
    }

}
