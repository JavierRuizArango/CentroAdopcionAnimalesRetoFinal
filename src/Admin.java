public abstract class Admin extends User implements IRead {
    private String name;
    private String lastname;
    private long cc;
    private String email;
    protected String userType;

    public Admin() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String UserType) {
        UserType = UserType;
    }

    public void createAnimal() {

    }

    @Override
    public void readAnimal() {

    }
    public void upDateAnimal() {

    }

    public void deleteAnimal() {

    }

    public void createEmploee() {

    }


    public void readEmploee() {

    }

    public void upDateEmploee() {

    }

    public void deleteEmploee() {

    }


}
