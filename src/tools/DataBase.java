package tools;

import animalProcess.Animal;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class DataBase {

    Workbook workbook = new XSSFWorkbook();
    // Creamos las hojas de cálculo
    Sheet sheet1 = (workbook.getSheet("Animales") == null) ? workbook.createSheet("Animales") : workbook.getSheet("Animales");
    Sheet sheet2 = (workbook.createSheet("Adoptantes") == null)  ? workbook.createSheet("Adoptantes") : workbook.getSheet("Adoptantes");
    Sheet sheet3 = (workbook.createSheet("Empleados")== null)  ? workbook.createSheet("Empleados") : workbook.getSheet("Empleados");
    Sheet sheet4 = (workbook.createSheet("Administradores")== null)  ? workbook.createSheet("Administradores") : workbook.getSheet("Administradores");
    Sheet sheet5 = (workbook.createSheet("Proceso")== null)  ? workbook.createSheet("Proceso") : workbook.getSheet("Proceso");
    Row row = sheet1.createRow(0);
    public DataBase(){
        Row row = sheet1.createRow(0);
        String[] title = {"ID", "Nombre", "Edad", "Especie", "EstadoSalud", "Descripcion", "Estatus"};
        for (int i = 0; i < title.length; i++) {
            row.createCell(i).setCellValue(title[i]);
        }
    }

    public void createAnimal(int id, String name, String age, String specie ,String healStatus, String description ,boolean available ){
        Row row = this.sheet1.createRow(1);
        // Agregamos los datos del animal a la fila
        row.createCell(0).setCellValue(id);
        row.createCell(1).setCellValue(name);
        row.createCell(2).setCellValue(age);
        row.createCell(3).setCellValue(specie);
        row.createCell(4).setCellValue(healStatus);
        row.createCell(5).setCellValue(description);
        row.createCell(6).setCellValue(available);




        this.escribirArchivo();


    }
    public void escribirArchivo (){
        try{
            FileOutputStream outputStream = new FileOutputStream("C:\\Data/Database.xlsx");
            this.workbook.write(outputStream);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int generateId () {
        return (int) (Math.random() * 1000);
    }

}




