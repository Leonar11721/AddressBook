import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AddressBook {

    HashMap<String, String> contactos;

    public AddressBook() {
        contactos = new HashMap<>();
    }

    public void load() {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("contactos.txt"));

            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");

                contactos.put(datos[0], datos[1]);
            }

            lector.close();

        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo.");
        }
    }
    public void save() {
        try {
            java.io.PrintWriter escritor = new java.io.PrintWriter("contactos.txt");

            for (String telefono : contactos.keySet()) {
                String nombre = contactos.get(telefono);

                escritor.println(telefono + "," + nombre);
            }

            escritor.close();

        } catch (java.io.IOException e) {
            System.out.println("No se pudo guardar el archivo.");
        }
    }
    public void getAllContacts() {
        for (String telefono : contactos.keySet()) {
            String nombre = contactos.get(telefono);

            System.out.println("Nombre: " + nombre + " | Teléfono: " + telefono);
        }
    }
    public void createContact(String telefono, String nombre) {
        contactos.put(telefono, nombre);
    }
    public void deleteContact(String telefono) {
        contactos.remove(telefono);
    }

}