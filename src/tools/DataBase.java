package tools;

import animalProcess.Animal;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataBase {
    private Workbook workbook;
    private Sheet sheet1;

    public DataBase() {
        try {
            File file = new File("Database.xlsx");
            FileInputStream fileIN;
            if (file.exists()) {
                fileIN = new FileInputStream(file);
                workbook = new XSSFWorkbook(fileIN);
                fileIN.close();
            } else {
                workbook = new XSSFWorkbook();
            }

            // Crear la hoja de cálculo "Animales" si no existe
            sheet1 = workbook.getSheet("Animales");
            if (sheet1 == null) {
                sheet1 = workbook.createSheet("Animales");
                Row headerRow = sheet1.createRow(0);
                String[] title = {"ID", "Nombre", "Edad", "Especie", "EstadoSalud", "Descripcion", "Estatus"};
                for (int i = 0; i < title.length; i++) {
                    headerRow.createCell(i).setCellValue(title[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // metodo que creea un animal
    public void createAnimal(int id, String name, String age, String specie, String healStatus, String description, boolean available) {
        int lastRowNum = sheet1.getLastRowNum();
        Row row = sheet1.createRow(lastRowNum + 1);

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

    //metodo que actualiza un animal
    public void updateAnimal(int id, String name, String age, String specie, String healStatus, String description, boolean available) {
        for (int rowNum = 1; rowNum <= sheet1.getLastRowNum(); rowNum++) {
            Row row = sheet1.getRow(rowNum);
            int currentId = (int) row.getCell(0).getNumericCellValue();
            if (currentId == id) {
                row.getCell(1).setCellValue(name);
                row.getCell(2).setCellValue(age);
                row.getCell(3).setCellValue(specie);
                row.getCell(4).setCellValue(healStatus);
                row.getCell(5).setCellValue(description);
                row.getCell(6).setCellValue(available);
                this.escribirArchivo();
                return;
            }
        }
        // Si no se encuentra el animal con el ID proporcionado, puedes manejar este caso como desees, por ejemplo, lanzando una excepción.
        throw new IllegalArgumentException("Animal con ID " + id + " no encontrado.");
    }

    public void escribirArchivo() {
        try {
            FileOutputStream outputStream = new FileOutputStream("Database.xlsx");
            workbook.write(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int generateId() {
        return (int) (Math.random() * 1000);
    }

}