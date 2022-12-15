package entidades;

//Libreria de java util que proporciona los metodos o clases ToString, Equals y HashCode
import java.util.Objects;

public class Persona {

    //Utilizamos protected para poder heredar desde las subclases sim implementar get y set
    protected String nombre;
    protected String apellido;

	
    //Constructor con parametros
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Metodo saludar
    public void saludar() {
        System.out.println("Hola!");
    }

    //ToString para visualizarlo en el main
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    //Proporciona de la clase Object, evalúa si dos objetos creados son iguales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    //Proporciona de la clase Object, un codigo distintivo para cada objeto
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
