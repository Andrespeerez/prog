import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Biblioteca miBiblioteca = new Biblioteca();

    public static void main(String[] args) {

        menu();


    }

    public static void menu() {
        System.out.println("\nQue queires hacer?");
        System.out.println("1 - Añadir publicacion");
        System.out.println("2 - Prestar una publicacion");
        System.out.println("3 - Devolver una publicacion");
        System.out.println("4 - Mostrar catalogo");
        System.out.println("5 - Mostrar prestamos");
        System.out.println("6 - Salir");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                menuAnyadirPublicacion();
                menu();
                break;
            case 2:
                prestarPublicacion();
                menu();
                break;
            case 3:
                devolverPublicacion();
                menu();
                break;
            case 4:
                mostrarPublicacionesDisponibles();
                menu();
                break;
            case 5:
                mostrarPublicacionesPrestadas();
                menu();
                break;
            case 6:
                break;
            default:
                System.out.println("Opcion no reconocida");
                menu();
        }
    }

    public static void menuAnyadirPublicacion() {
        System.out.println("\nQue tipo de publicación quieres añadir?");
        System.out.println("1 - Libro");
        System.out.println("2 - Revista");
        System.out.println("3 - Periodico");
        System.out.println("4 - Volver");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                anyadirLibro();
                break;
            case 2:
                anyadirRevista();
                break;
            case 3:
                anyadirPeriodico();
                break;
            case 4:
                break;
            default:
                menuAnyadirPublicacion();
        }


    }

    public static void anyadirLibro() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = sc.next();
        System.out.print("Autor: ");
        String autor = sc.next();
        System.out.print("Año: ");
        int anioPublicacion = sc.nextInt();
        System.out.print("Genero: ");
        String genero = sc.next();
        System.out.print("Num Paginas: ");
        int numPaginas = sc.nextInt();

        Libro libro = new Libro(
                titulo,
                autor,
                anioPublicacion,
                genero,
                numPaginas
        );

        // agrega publicacion a catálogo
        miBiblioteca.agregarPublicacion(libro);


    }

    public static void anyadirRevista() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = sc.next();
        System.out.print("Autor: ");
        String autor = sc.next();
        System.out.print("Año: ");
        int anioPublicacion = sc.nextInt();
        System.out.print("Numero Edicion: ");
        int numeroEdicion = sc.nextInt();
        System.out.print("Categoria: ");
        String categoria = sc.next();

        Revista revista = new Revista(
                titulo,
                autor,
                anioPublicacion,
                numeroEdicion,
                categoria
        );

        // agrega publicacion a catálogo
        miBiblioteca.agregarPublicacion(revista);

    }

    public static void anyadirPeriodico() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = sc.next();
        System.out.print("Autor: ");
        String autor = sc.next();
        System.out.print("Año: ");
        int anioPublicacion = sc.nextInt();
        System.out.print("Numero Edicion: ");
        String fechaPublicacion = sc.next();
        System.out.print("Categoria: ");
        String editorial = sc.next();

        Periodico periodico = new Periodico(
                titulo,
                autor,
                anioPublicacion,
                fechaPublicacion,
                editorial
        );

        // agrega publicacion a catálogo
        miBiblioteca.agregarPublicacion(periodico);
    }

    public static void prestarPublicacion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPrestamo de Publicacion");
        System.out.print("Titulo: ");
        String titulo = sc.next();

        miBiblioteca.prestarPublicacion(titulo);
    }

    public static void devolverPublicacion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDevolver Publicacion");
        System.out.print("Titulo: ");
        String titulo = sc.next();

        miBiblioteca.devolverPublicacion(titulo);
    }

    public static void mostrarPublicacionesDisponibles() {
        miBiblioteca.mostrarCatalogo();
    }

    public static void mostrarPublicacionesPrestadas() {
        miBiblioteca.mostrarPrestamos();
    }


    // Test ejercicio 1:
    public static void testEjercicio1()  {
        Libro libro = new Libro(
                "Cosa",
                "cosa",
                2021,
                "cosa",
                220
        );


        Periodico periodico = new Periodico(
                "Cosa",
                "cosa",
                2021,
                "cosa",
                "co"
        );

        libro.mostrarInformacion();
        periodico.mostrarInformacion();
    }
}