public abstract class User {
    private String name;
    private String lastname;
    private long cc;
    private String email;

    public User(String name, String lastname, long cc, String email) {
        this.name = name;
        this.lastname = lastname;
        this.cc = cc;
        this.email = email;
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
}
