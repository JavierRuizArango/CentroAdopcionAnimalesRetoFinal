public abstract  class Animal {
    private String name;
    private String age;
    private String species;
    private String healStatus;
    private String description;
    private boolean available;

    public Animal(String name, String age,String species, String healStatus, String description, boolean available) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.healStatus = healStatus;
        this.description = description;
        this.available = available;
    }


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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString(){
        return "El nombre es: "+ getName() + ", " +"La edad es: "+ getAge() + ", "+"La especie es: "+ getSpecies()+ ", "+"Vitalidad: " + getHealStatus() + ", " +"Descripcion:  "+ getDescription() + "," + "Disponible: "+ isAvailable();
    }

    public abstract String mostrarDatos();

    public abstract String desplazar ();

}
