import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person {

    private String document;
    private String name;
    private int height;
    private GenderType gender;
    private double weight;
    private boolean organDonor;
    private String cp;
    private String creationDate;

    private final String surname;

    public Person(String document,
                  String name,
                  String surname,
                  int height,
                  GenderType gender,
                  double weight,
                  boolean organDonor,
                  String cp) {

        this.document = document;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.gender = gender;
        this.weight = weight;
        this.organDonor = organDonor;
        this.cp = cp;

        LocalDate today = LocalDate.now();
        String format = "dd/MM/yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        this.creationDate = today.format(formatter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String document;
        String name;
        String surname;
        int height;
        GenderType gender;
        double weight;
        boolean organDonor;
        String cp;

        System.out.println(" -- Creador de Persona --");
        System.out.println("1. Introduce un documento de identidad válido");
        document = sc.next();
        sc.nextLine(); // limpia el buffer

        System.out.println("2. Introduce un nombre");
        name = sc.next();
        sc.nextLine();

        System.out.println("3. Introduce un apellido");
        surname = sc.next();
        sc.nextLine();

        System.out.println("4. Introduce una altura (en cm)");
        height = sc.nextInt();
        sc.nextLine();

        System.out.println("5. Escribe M para hombre o F para mujer");
        String genderI = sc.next();
        sc.nextLine();
        if(genderI.equals("M")) gender = GenderType.M;
        if(genderI.equals("F")) gender = GenderType.F;
        else gender = GenderType.M;

        System.out.println("6. Cuanto pesa? (en kg)");
        weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("7. Es donante de organos? (Y o N)");
        String organDonorI = sc.next();
        sc.nextLine();
        if(organDonorI.equalsIgnoreCase("Y")) organDonor = true;
        if(organDonorI.equalsIgnoreCase("N")) organDonor = false;
        else organDonor = false;

        System.out.println("8. Cual es su código postal?");
        cp = sc.next();
        sc.nextLine();
        System.out.println("/nCreando Persona");
        Person persona = new Person(document, name, surname, height, gender, weight, organDonor, cp);
        System.out.println("/nResultado:");
        persona.printPerson();
    }

    public void printPerson() {
        System.out.println(document + " " + name + " " + surname + " " + height + " " + gender + " " + weight + " " + organDonor + " " + cp + " " + creationDate);
    }
}