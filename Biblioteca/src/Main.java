/*1. Crear una clase Entidad:

Debe tener 3 atributos genéricos: atributo1, atributo2, atributo3.
- Incluir:
  - Constructor con parámetros.
  - Getters y Setters para cada atributo.
  - Método toString().

2. Crear una clase GestionEntidades:
- Contendrá un ArrayList<Entidad>.
- Incluir métodos para:
    - Agregar una entidad.
    - Buscar una entidad por atributo1.
    - Buscar una o más entidades por atributo2.
    - Mostrar todas las entidades.

3. Crear una clase Main:

- Debe tener el método main.
- Incluir un menú interactivo por consola que permita:
      - Agregar nueva entidad.
      - Buscar por atributo1.
      - Buscar por atributo2.
      - Mostrar todas las entidades.
      - Agregar algo personalizado por ustedes ejemplo: busqueda por fecha de creacion o mas reciente o por mas popular o cualquier ejemplo.
*  */

//Entidad Libros
//Atributo 1: Nombre
//Atributo 2: Categoria
//Atributo 3: Anio

import java.util.Scanner;

public class Main {

    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continuar = true;
        do{

            System.out.println("BIBLOTECA");
            System.out.println("1. Agregar nuevo libro");
            System.out.println("2. Buscar por categoria");
            System.out.println("3. Buscar por año");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Buscar por mas reciente");
            System.out.println("6. Salir");

            String opcion = teclado.nextLine();

            switch (opcion){

                case "1":
                        GestionBiblioteca.AgregarLibro();
                    break;
                case "2":
                        GestionBiblioteca.buscarPorCategoria
                                ();
                    break;
                case "3":
                        GestionBiblioteca.buscarPorAnio();
                    break;
                case "4":
                        GestionBiblioteca.mostrarTodosLosLibros();
                    break;
                case "5":
                        GestionBiblioteca.obtenerLibrosMasRecientes();
                    break;
                case "6":
                    System.out.printf("Esta seguro de salir?");
                    String salir = teclado.nextLine().toLowerCase();
                    if(salir.equals("si")){
                        System.out.printf("Saliendo...");
                        continuar = false;
                    }
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
                    break;

            }

        }while(continuar);

        }
    }
