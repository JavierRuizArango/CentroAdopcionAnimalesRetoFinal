package tools;

import java.util.Scanner;

public class EmployeeTools {
    public static void menuEmployee(String respuestaEmployee) {


        boolean regresarAlMenuPrincipal = false;
        do {
            System.out.println("Señor Empleado que desea hacer?\n");
            System.out.println("1. ver animales disponibles");
            System.out.println("2. Crear un nuevo un nuevo proceso de adopcion");
            System.out.println("3.  actualizar un  proceso de adopcion");
            System.out.println("4. eliminar proceso de adopcion");
            System.out.println("5. Regresar al menu anterior");
            Scanner scanner = new Scanner(System.in);
            String respuestaSubMenu = scanner.nextLine();
            switch (respuestaSubMenu){
                case "1":
                    System.out.println("1. ver animales disponibles");
                    System.out.println("¿Desea realizar otra acción? (Sí/No)");
                    String otraAccion1 = scanner.nextLine().toLowerCase();
                    if (otraAccion1.equals("no")) {
                        regresarAlMenuPrincipal = true;
                    }

                    break;
                case "2":
                    System.out.println("2. Crear un nuevo un nuevo proceso de adopcion");
                    System.out.println("¿Desea realizar otra acción? (Sí/No)");
                    String otraAccion2 = scanner.nextLine().toLowerCase();
                    if (otraAccion2.equals("no")) {
                        regresarAlMenuPrincipal = true;
                    }
                    break;
                case "3" :
                    System.out.println("3.  actualizar un  proceso de adopcion");
                    System.out.println("¿Desea realizar otra acción? (Sí/No)");
                    String otraAccion3 = scanner.nextLine().toLowerCase();
                    if (otraAccion3.equals("no")) {
                        regresarAlMenuPrincipal = true;
                    }
                    break;
                case "4" :
                    System.out.println("4. Elimino un proceso de adopcion");
                    System.out.println("¿Desea realizar otra acción? (Sí/No)");
                    String otraAccion4 = scanner.nextLine().toLowerCase();
                    if (otraAccion4.equals("no")) {
                        regresarAlMenuPrincipal = true;
                    }
                case "5":
                    System.out.println("9. Salir del sub menú");
                    regresarAlMenuPrincipal = true;
                    break;
            }
        } while (!regresarAlMenuPrincipal);



}   }





