package users;
import interfaces.IRead;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }

            this.name = name;
        } catch (IllegalArgumentException e) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, "El nombre no puede estar vacío", e);
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        try {
            if (lastname == null || lastname.isEmpty()) {
                throw new IllegalArgumentException("El apellido no puede estar vacío");
            }

            this.lastname = lastname;
        } catch (IllegalArgumentException e) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, "El apellido no puede estar vacío", e);
        }
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        try {
            if (cc <= 0) {
                throw new IllegalArgumentException("El número de tarjeta de crédito debe ser mayor que 0");
            }

            this.cc = cc;
        } catch (IllegalArgumentException e) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, "El número de tarjeta de crédito debe ser mayor que 0", e);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            if (email == null || email.isEmpty()) {
                throw new IllegalArgumentException("El correo electrónico no puede estar vacío");
            }

            if (!email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                throw new IllegalArgumentException("El correo electrónico no es válido");
            }

            this.email = email;
        } catch (IllegalArgumentException e) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, "El correo electrónico no es válido", e);
        }
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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


}
