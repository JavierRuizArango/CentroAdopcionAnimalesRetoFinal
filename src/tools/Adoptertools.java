package tools;

import java.util.Scanner;

public class Adoptertools {
    public static void menuAdopter(String respuestaAdopter) {

        boolean regresarAlMenuPrincipal = false;
        do {
            System.out.println("Señor Adoptante que desea hacer?\n");
            System.out.println("1. ver animales disponibles");
            System.out.println("2. Registrarse como adoptante");
            System.out.println("3.  actualizar sus  datos personales");
            System.out.println("4. Solicitar un proceso de adopcion");
            System.out.println("5. Regresar al menu anterior");
            Scanner scanner = new Scanner (System.in);
            String respuestaSubMenu = scanner.nextLine();
            switch (respuestaSubMenu){
            case "1":
                System.out.println("aqui le mostramos al adoptante los animales disponibles");
                System.out.println("¿Desea realizar otra acción? (Sí/No)");
                String otraAccion1 = scanner.nextLine().toLowerCase();
                if (otraAccion1.equals("no")) {
                    regresarAlMenuPrincipal = true;
                }
                break;
            case "2":
                System.out.println("aqui se  Registra como adoptante");
                System.out.println("¿Desea realizar otra acción? (Sí/No)");
                String otraAccion2 = scanner.nextLine().toLowerCase();
                if (otraAccion2.equals("no")) {
                    regresarAlMenuPrincipal = true;
                }
                break;
            case "3" :
                System.out.println("aqui actualiza sus  datos personales");
                System.out.println("¿Desea realizar otra acción? (Sí/No)");
                String otraAccion3 = scanner.nextLine().toLowerCase();
                if (otraAccion3.equals("no")) {
                    regresarAlMenuPrincipal = true;
                }
                break;
            case "4" :
                System.out.println("aqui  Solicita un proceso de adopcion");
                System.out.println("¿Desea realizar otra acción? (Sí/No)");
                String otraAccion4 = scanner.nextLine().toLowerCase();
                if (otraAccion4.equals("no")) {
                    regresarAlMenuPrincipal = true;
                }
                break;
            case "5":
                System.out.println("con esta opcion Sale del sub menú");
                Tools.salir= false;
                break;
            }
        } while (!regresarAlMenuPrincipal);
    }
}
