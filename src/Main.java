import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gato> listGato = new ArrayList<>();
        ArrayList<Perro> listPerro = new ArrayList<>();
        //Vamos agregar atributos a la lista

        listGato.add(new Gato("paco","18","felino","sano","Felino domestico",true,"michi"));
        listPerro.add(new Perro("Simon","15","canino","sano","Perro domestico lindo",false,"Golden retriever"));

        for (Gato datos : listGato) {
            System.out.println(" Los datos del gato son : "+" "+ datos.mostrarDatos());

        }

        for (Perro datos: listPerro) {
            System.out.println(" Los datos del perro son :"+""+datos.mostrarDatos());

        }

    }
}