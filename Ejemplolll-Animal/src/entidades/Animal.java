package entidades;

public class Animal {

    protected String nombre;

    public Animal(){
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void Accion(){
        System.out.println("Estoy caminando");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
