package users;
import animalProcess.Animal;
import interfaces.IRead;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;

public  class Admin extends User implements IRead {

    private static Animal animal = new Animal();

    public Admin() {
        super();
    }
    private String name;
    private String lastname;
    private long cc;
    private String email;
    protected String userType;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }

            this.name = name;
        } catch (IllegalArgumentException e) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, "El nombre no puede estar vacío", e);
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        try {
            if (lastname == null || lastname.isEmpty()) {
                throw new IllegalArgumentException("El apellido no puede estar vacío");
            }

            this.lastname = lastname;
        } catch (IllegalArgumentException e) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, "El apellido no puede estar vacío", e);
        }
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        try {
            if (cc <= 0) {
                throw new IllegalArgumentException("El número de tarjeta de crédito debe ser mayor que 0");
            }

            this.cc = cc;
        } catch (IllegalArgumentException e) {
            //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, "El número de tarjeta de crédito debe ser mayor que 0", e);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            if (email == null || email.isEmpty()) {
                throw new IllegalArgumentException("El correo electrónico no puede estar vacío");
            }

            if (!email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                throw new IllegalArgumentException("El correo electrónico no es válido");
            }

            this.email = email;
        } catch (IllegalArgumentException e) {
           // Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, "El correo electrónico no es válido", e);
        }
    }

    @Override
    public void readAnimal() {

    }

    @Override
    public void readAnimal(Workbook workbook) {

    }


    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public static void createAnimal() {
        animal.create();
    }
    //@Override
    /*public void IreadAnimal(Workbook workbook) {
        if (workbook == null) {
            System.out.println("El archivo Excel es nulo.");
            return;
        }

        // Busca la hoja de Excel con el nombre "Animales".
        Sheet sheet = workbook.getSheet("Animales");

        if (sheet == null) {
            System.out.println("La hoja 'Animales' no se encontró en el archivo Excel.");
            return;
        }

        // Itera sobre las filas y columnas para leer los datos de la hoja.
        for (Row row : sheet) {
            // Ignoramos la primera fila, ya que generalmente contiene encabezados.
            if (row.getRowNum() == 0) {
                continue;
            }

            // Lee los datos de cada celda en la fila.
            int id = (int) row.getCell(0).getNumericCellValue();
            String name = row.getCell(1).getStringCellValue();
            String age = row.getCell(2).getStringCellValue();
            String specie = row.getCell(3).getStringCellValue();
            String healthStatus = row.getCell(4).getStringCellValue();
            String description = row.getCell(5).getStringCellValue();
            boolean available = row.getCell(6).getBooleanCellValue();

            // Realiza las operaciones necesarias con los datos leídos.
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + name);
            System.out.println("Edad: " + age);
            System.out.println("Especie: " + specie);
            System.out.println("Estado de salud: " + healthStatus);
            System.out.println("Descripción: " + description);
            System.out.println("Disponible: " + available);
            System.out.println("-----------");
        }
    }*/

    public void upDateAnimal() {

        animal.upDate();
    }

    public void deleteAnimal() {

    }


}