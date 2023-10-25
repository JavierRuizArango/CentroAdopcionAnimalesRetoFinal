package users;

import interfaces.IRead;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class User implements IRead {

    private String name;
    private String lastname;
    private long cc;
    private String email;

    private static final Logger logger = Logger.getLogger(User.class.getName());


    public User() {
        this.name = name;
        this.lastname = lastname;
        this.cc = cc;
        this.email = email;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        try {
            if (name.isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }

            this.name = name;
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {
        try {
            if (lastname.isEmpty()) {
                throw new IllegalArgumentException("El apellido no puede estar vacío");
            }

            this.lastname = lastname;
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    public long getCc() {

        return cc;
    }

    public void setCc(long cc) {
        try {
            if (cc <= 5) {
                throw new IllegalArgumentException("El número de Cedula debe ser mayor que 5 numeros");
            }

            this.cc = cc;
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        try {
            if (!email.contains("@")) {
                throw new IllegalArgumentException("El correo electrónico debe contener un símbolo @");
            }

            this.email = email;
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }

    }



    public abstract void readAnimal();
}

