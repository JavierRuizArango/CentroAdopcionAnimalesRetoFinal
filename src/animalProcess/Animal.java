package animalProcess;

import tools.DataBase;

import java.util.Scanner;

public class Animal {
    Scanner sc = new Scanner(System.in);
    private int id;
    private static String name;
    private String age;
    private String species;
    private String healStatus;
    private String description;
    private boolean available;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age= age;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHealStatus() {
        return healStatus;
    }

    public void setHealStatus(String healStatus) {
        this.healStatus = healStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(1==1){
            this.id = id;
        }

    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void create(){
        DataBase db = new DataBase();
        setId(DataBase.generateId());
        System.out.println("Digite nombre");
        setName(this.sc.nextLine());
        System.out.println("Digite Edad");
        setAge(this.sc.nextLine());
        System.out.println("Digite especie");
        setSpecies(this.sc.nextLine());
        System.out.println("Digite descripcion");
        setDescription(this.sc.nextLine());
        System.out.println("Digite Estado de Salud");
        setHealStatus(this.sc.nextLine());
        System.out.println("Disponibilidad " + this.available);

        db.createAnimal(getId(), getName(),getAge(),getSpecies(),getDescription(),getHealStatus(), true );

    }

    public void upDate(){
        DataBase db = new DataBase();
        System.out.println("Digite nombre");
        setName(this.sc.nextLine());
        System.out.println("Digite Edad");
        setAge(this.sc.nextLine());
        System.out.println("Digite especie");
        setSpecies(this.sc.nextLine());
        System.out.println("Digite descripcion");
        setDescription(this.sc.nextLine());
        System.out.println("Digite Estado de Salud");
        setHealStatus(this.sc.nextLine());
        System.out.println("Disponibilidad " + this.available);
        db.createAnimal(getId(), getName(),getAge(),getSpecies(),getDescription(),getHealStatus(), true );
    }

}

