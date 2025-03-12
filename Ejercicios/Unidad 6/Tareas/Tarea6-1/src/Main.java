/**
 * Main
 *
 * By Andrés Pérez Guardiola 1º DAW semi
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TelefonoMovil myTelefono = new TelefonoMovil("968989848");

        Scanner sc = new Scanner(System.in);

        menu:
        while (true) {
            imprimirMenu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    break menu;
                case 1:
                    printContactos(myTelefono);
                    break;
                case 2:
                    addContacto(myTelefono);
                    break;
                case 3:
                    updateContacto(myTelefono);
                    break;
                case 4:
                    deleteContacto(myTelefono);
                    break;
                case 5:
                    findContacto(myTelefono);
                    break;
                default:
                    System.out.println("Respuesta no conocida\nVuelve a intentarlo\n");
            }

            System.out.println();
        }

    }

    public static void imprimirMenu() {
        System.out.println("0 - Salir");
        System.out.println("1 - Imprimir Contactos");
        System.out.println("2 - Agregar Contacto");
        System.out.println("3 - Actualizar Contacto");
        System.out.println("4 - Eliminar Contacto");
        System.out.println("5 - Buscar Contacto");
    }
    
    // funcion de pasamanos
    public static void printContactos(TelefonoMovil myTelefono) {
        myTelefono.printContacts();
    }

    private static void addContacto(TelefonoMovil myTelefono) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre: ");
        String nombre = sc.next();

        System.out.print("Introduce el numero: ");
        String numero = sc.next();

        Contacto c = Contacto.createContact(nombre, numero);

        myTelefono.addNewContact(c);
    }

    private static void findContacto(TelefonoMovil myTelefono) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Que contacto quieres consultar? (nombre) ");
        String nombre = sc.next();

        Contacto c = myTelefono.queryContact(nombre);

        if(c == null) {
            System.out.println("Contacto no encontrado");
        } else {
            System.out.println(c.getName() + " -> " + c.getPhoneNumber());
        }
    }

    private static void deleteContacto(TelefonoMovil myTelefono) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Que contacto quieres eliminar? (nombre) ");
        String nombre = sc.next();

        Contacto c = myTelefono.queryContact(nombre);

        if (myTelefono.removeContact(c)) {
            System.out.println("Borrado con éxito");
        } else {
            System.out.println("No se ha podido borrar");
        }
    }

    private static void updateContacto(TelefonoMovil myTelefono) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Que contacto quieres modificar? (nombre) ");
        String nombre = sc.next();

        Contacto c1 = myTelefono.queryContact(nombre);
        if (c1 == null) {
            System.out.println("Contacto no existe");
            return;
        }

        System.out.print("Introduce el nuevo nombre: ");
        String nombreNuevo = sc.next();
        System.out.print("Introduce el nuevo numero: ");
        String numeroNuevo = sc.next();

        Contacto c2 = Contacto.createContact(nombreNuevo, numeroNuevo);

        myTelefono.updateContact(c1, c2);
    }
}
