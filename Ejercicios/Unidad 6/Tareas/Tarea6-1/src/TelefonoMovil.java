/**
 * Telefono movil
 *
 * By Andrés Pérez Guardiola 1º DAW semi
 */
import java.util.ArrayList;

public class TelefonoMovil {

    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contacto>();
    }

    private int findContact(Contacto contacto) {
        return myContacts.indexOf(contacto);
    }

    private int findContact(String name) {
        for (int index = 0; index < myContacts.size(); index++) {
             if(myContacts.get(index).getName().equals(name))   return index;
        }

        return -1; // no encontrado
    }

    public boolean addNewContact(Contacto contacto) {
        if(this.findContact(contacto) != -1)   return false;

        return myContacts.add(contacto);
    }

    public boolean updateContact(Contacto contacto, Contacto contactoNuevo) {
        int index = this.findContact(contacto);
        if(index == -1)   return false;

        myContacts.set(index, contactoNuevo);
        return true;
    }

    public boolean removeContact(Contacto contacto) {
        return myContacts.remove(contacto);
    }

    public Contacto queryContact(String name) {
        int index = findContact(name);
        if(index == -1) return null;

        return myContacts.get(index);
    }

    public void printContacts() {
        System.out.println("Lista de contactos:");
        for(int index = 0; index < myContacts.size(); index++) {
            System.out.println(index + ". " + myContacts.get(index).getName() + " -> " + myContacts.get(index).getPhoneNumber());
        }
    }

}
