package entidades;

public class Gato extends Animal{

    protected String color;

    public Gato(){
    }

    public Gato(String color) {
        this.color = color;
    }

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public void Accion() {
        System.out.println("Estoy maullando");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
