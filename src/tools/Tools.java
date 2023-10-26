package tools;
import java.util.Scanner;
public class Tools {
    // Declara una variable para almacenar la respuesta del usuario
    public static String respuesta;
    public static boolean salir;

    public static void menu() {
        // Crea un bucle do-while para iterar sobre las opciones del menú
         boolean  salir = false; // Variable para controlar la salida del bucle
        do {
            // Muestra las opciones del menú al usuario
            System.out.println("¿Quién eres? \n");
            System.out.println("1. Administrador ");
            System.out.println("2. Empleado");
            System.out.println("3. Adoptante");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción");

            // Pide al usuario que seleccione una opción
            Scanner scanner = new Scanner(System.in);
            respuesta = scanner.next();

            // Evalua la opción del usuario
            switch (respuesta) {
                case "1":
                    // Muestra el sub menú para administradores
                    AdminTools.menuAdmin(respuesta);
                    // Pide al usuario que seleccione una opción
                    String respuestaAdmin = scanner.nextLine();
                    break;
                case "2":
                    // Muestra el sub menú para empleados
                    EmployeeTools.menuEmployee(respuesta);
                    String respuestaEmployee = scanner.nextLine();
                    break;
                case "3":
                    // Muestra el sub menú para adoptantes
                    Adoptertools.menuAdopter(respuesta);
                    String respuestaAdopter = scanner.nextLine();
                    break;
                case "4":
                    // Sale de la aplicación
                    salir = true; // Establece salir en true para terminar el bucle
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    // Opción inválida
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (!salir); // El bucle se ejecuta hasta que salir sea true
    }
}





