import java.util.Scanner;

public class Tools {

    public  static void menu(){


            // Declara una variable para almacenar la respuesta del usuario
            String respuesta;

            // Crea un bucle do-while para iterar sobre las opciones del menú
            do {
                // Muestra las opciones del menú al usuario
                System.out.println("¿Quién eres?");
                System.out.println("1. Administrador");
                System.out.println("2. Empleado");
                System.out.println("3. Adoptante");
                System.out.println("4. Salir");

                // Pide al usuario que seleccione una opción
                Scanner scanner = new Scanner(System.in);
                respuesta = scanner.nextLine();

                // Evalua la opción del usuario
                switch (respuesta) {
                    case "1":
                        // Muestra el sub menú para administradores
                        System.out.println("¿Qué quieres hacer como administrador?");
                        System.out.println("1. Crear un nuevo Animal");
                        System.out.println("2. Actualizar un Animal existente");
                        System.out.println("3. Eliminar un Animal");
                        System.out.println("4. Crear un nuevo Empleado");
                        System.out.println("5. Actualizar un Empleado");
                        System.out.println("6. Eliminar un Empleado");
                        System.out.println("7. Ver lista de Animales");
                        System.out.println("8. Ver Lista Empleados");
                        // Pide al usuario que seleccione una opción




                        do {
                            // Pide al usuario que seleccione una opción del sub menú
                            System.out.println("¿Qué quieres hacer?");
                            System.out.println("1. Crear un nuevo Animal");
                            System.out.println("2. Actualizar un Animal existente");
                            System.out.println("3. Eliminar un Animal");
                            System.out.println("4. Salir del sub menú");

                            // Pide al usuario que seleccione una opción
                            scanner = new Scanner(System.in);
                            respuesta = scanner.nextLine();

                            // Evalua la opción del usuario
                            switch (respuesta) {
                                case "1":
                                    // Crea un nuevo usuario
                                    break;
                                case "2":
                                    // Actualiza un usuario existente
                                    break;
                                case "3":
                                    // Elimina un usuario
                                    break;
                                case "4":
                                    // Sale del sub menú
                                    break;
                                default:
                                    // Opción inválida
                                    System.out.println("Opción inválida.");
                                    break;
                            }
                        } while (!respuesta.equals("4"));
                        break;
                    case "2":
                        // Muestra el sub menú para empleados
                        break;
                    case "3":
                        // Muestra el sub menú para adoptantes
                        break;
                    case "4":
                        // Sale de la aplicación
                        System.out.println("Hasta pronto!");
                        break;
                    default:
                        // Opción inválida
                        System.out.println("Opción inválida.");
                        break;
                }
            } while (true);
        }
    }





