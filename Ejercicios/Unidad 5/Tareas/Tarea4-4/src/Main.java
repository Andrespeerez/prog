public class Main {

    public static void main(String[] args) {


        Bienes bien = new Bienes("Objeto generico", 0.8);
        Comida comida = new Comida("Plato macarrones", 5.6, 300.6);

        Imponible juguete = new Juguete("Play Station", 799.99, 12);
        Imponible libro = new Libro("Las mil y una noches", 12.4, "Anonimo");



        System.out.println(bien.toString());

        System.out.println();
        System.out.println(comida.toString());

        System.out.println();
        System.out.println(juguete.toString());
        juguete.calcularImpuesto();

        System.out.println();
        System.out.println(libro.toString());
        libro.calcularImpuesto();

        System.out.println();
        Libro libroCasteado = (Libro) libro; // Peligro! no todos los Imponibles son Libros
        System.out.println(libroCasteado.getAutor());
    }
}
