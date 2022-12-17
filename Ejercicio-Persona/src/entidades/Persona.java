package entidades;

public class Persona {

    protected String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void Saludar(){
        System.out.println("¡Buenas noches!");
    }

    @Override
    public String toString() {
        return "Persona -" +
                " nombre: '" + nombre + '\'';
    }
}
