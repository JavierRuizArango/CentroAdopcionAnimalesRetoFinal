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
                break;
            case "2":
                System.out.println("aqui se  Registra como adoptante");
                break;
            case "3" :
                System.out.println("aqui actualiza sus  datos personales");
                break;
            case "4" :
                System.out.println("aqui  Solicita un proceso de adopcion");
                break;
            case "5":
                System.out.println("con esta opcion Sale del sub menú");
                Tools.salir= false;
                break;
            }
        } while (!regresarAlMenuPrincipal);
    }
}
