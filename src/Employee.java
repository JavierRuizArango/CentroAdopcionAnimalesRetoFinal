

public abstract class Employee  extends User implements IRead{
    private String name;
    private String lastname;
    private long cc;
    private String email;

    protected String Roll;

    protected String usertype;

    public Employee(String name, String lastname, long cc, String email) {
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public long getCc() {
        return cc;
    }

    @Override
    public void setCc(long cc) {
        this.cc = cc;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String roll) {
        Roll = roll;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String userType) {
        this.usertype = usertype;
    }




}
