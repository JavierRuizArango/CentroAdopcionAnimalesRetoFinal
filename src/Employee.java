
public class Employee  extends User{
    private String name;
    private String lastname;
    private long cc;
    private String email;

    protected String Roll;

    protected String tipoUsuario;

    public Employee(String name, String lastname, long cc, String email) {
        super(name, lastname, email);
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

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
