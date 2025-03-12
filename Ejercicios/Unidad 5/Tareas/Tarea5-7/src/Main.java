import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[5];

        estudiantes[0] = new Estudiante("Patri", 1.70, 12);
        estudiantes[1] = new Estudiante("Manuel", 1.73, 43);
        estudiantes[2] = new Estudiante("Javier", 1.89, 72);
        estudiantes[3] = new Estudiante("Alicia", 1.68, 52);
        estudiantes[4] = new Estudiante("Alberto", 1.89, 35);

        for( Estudiante e : estudiantes) {
            System.out.println(e);
        }

        Arrays.sort(estudiantes);
        System.out.println();

        for( Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }
}
