/**
 * Model contacto
 *
 * By Andrés Pérez Guardiola 1º DAW semi
 */
public class Contacto {

    private String name, phoneNumber;

    private Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto createContact(String name, String phoneNumber) {
        return new Contacto(name, phoneNumber);
    }
}
