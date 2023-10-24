package tools;

import java.util.Scanner;

public class AdminTools {

    public static void menuAdmin(String respuesta) {
        Scanner scanner = new Scanner(System.in);

        boolean regresarAlMenuPrincipal = false;

        do {
            System.out.println("¿Qué quieres hacer como administrador?\n");
            System.out.println("1. Crear un nuevo animal");
            System.out.println("2. Ver lista de Animales");
            System.out.println("3. Actualizar un animal existente");
            System.out.println("4. Eliminar un animal");
            System.out.println("");
            System.out.println("A continuación se muestran las opciones para los empleados\n");
            System.out.println("5. Crear un nuevo Empleado");
            System.out.println("6. Ver Lista Empleados");
            System.out.println("7. Actualizar un Empleado");
            System.out.println("8. Eliminar un Empleado");
            System.out.println("9. Regresar al menú anterior");
            System.out.println("Ingrese una opción");
            String respuestaSubMenu = scanner.nextLine();

            switch (respuestaSubMenu) {
                case "1":
                    System.out.println("1. Se crea un nuevo animal");
                    // Agrega aquí la lógica para crear un nuevo animal
                    break;
                case "2":
                    System.out.println("2. Se mira la lista de animales");
                    // Agrega aquí la lógica para mostrar la lista de animales
                    break;
                case "3":
                    System.out.println("3. Se actualiza un animal");
                    // Agrega aquí la lógica para actualizar un animal existente
                    break;
                case "4":
                    System.out.println("4. Se elimina un animal");
                    // Agrega aquí la lógica para eliminar un animal
                    break;
                case "5":
                    System.out.println("5. Se crea un empleado");
                    // Agrega aquí la lógica para crear un empleado
                    break;
                case "6":
                    System.out.println("6. Se listan los empleados");
                    // Agrega aquí la lógica para mostrar la lista de empleados
                    break;
                case "7":
                    System.out.println("7. Se modifican los empleados");
                    // Agrega aquí la lógica para modificar empleados
                    break;
                case "8":
                    System.out.println("8. Se elimina un empleado");
                    // Agrega aquí la lógica para eliminar empleados
                    break;
                case "9":
                    System.out.println("9. Se regresa al menú anterior");
                    regresarAlMenuPrincipal = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (!regresarAlMenuPrincipal);
    }
}

