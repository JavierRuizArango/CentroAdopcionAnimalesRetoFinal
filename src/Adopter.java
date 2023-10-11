import java.util.Scanner;

public class Adopter extends User implements IRegistrarse {
    private String name;
    private String lastname;
    private long cc;
    private String email;
    public Adopter() {
        super(null, null,  null);

    }
    @Override
    public void registrarse() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            String input = scanner.nextLine();
            int numero = Integer.parseInt(input);
            System.out.println("El número es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("No es un número válido.");
        }

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
}
