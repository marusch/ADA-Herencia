package entidades;

public class ProfMaru extends Persona {

    protected String apellido;

    public ProfMaru() {
    }

    public ProfMaru(String apellido) {
        this.apellido = apellido;
    }

    public ProfMaru(String nombre, String apellido) {
        super(nombre);
        this.apellido = apellido;
    }

    @Override
    public void Saludar() {
        System.out.println("Que tengas buen receso, y felices fiestas💕 ");
    }

    @Override
    public String toString() {
        return "ProfMaru: " +
                " apellido: " + apellido + '\n' + super.toString();
    }
}
