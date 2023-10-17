public class Admin extends User implements IRegistrer {
    private String name;
    private String lastname;
    private long cc;
    private String email;
    protected String userType;

    public Admin() {
        super();
    }

    @Override
    public void register() {
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

    public void upDateAnimal() {

    }

    public void deleteAnimal() {

    }


    @Override
    public void registrer() {

    }
}
