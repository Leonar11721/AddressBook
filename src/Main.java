import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AddressBook agenda = new AddressBook();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- AGENDA ---");
            System.out.println("1. Mostrar contactos");
            System.out.println("2. Crear contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Guardar contactos");
            System.out.println("5. Cargar contactos");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    agenda.getAllContacts();
                    break;

                case 2:
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    agenda.createContact(telefono, nombre);
                    System.out.println("Contacto creado.");
                    break;

                case 3:
                    System.out.print("Teléfono del contacto a eliminar: ");
                    String telefonoEliminar = scanner.nextLine();

                    agenda.deleteContact(telefonoEliminar);
                    System.out.println("Contacto eliminado.");
                    break;

                case 4:
                    agenda.save();
                    System.out.println("Contactos guardados.");
                    break;

                case 5:
                    agenda.load();
                    System.out.println("Contactos cargados.");
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);
    }
}