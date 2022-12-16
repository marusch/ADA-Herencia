package entidades;

public class Hija extends Padre{
    //Atributo de la clase Hija
    protected String nombre;

    //Constructor sobreescrito o reutilizado de la clase Padre
    public Hija(String apellido, String nombre) {
        super(apellido);
        this.nombre = nombre;
    }

    //Metodo sobreescrito o reutilizado de la clase Padre
    @Override
    public void Accion() {
        System.out.println("Voy a correr..."); //Le cambiamos la acción
    }

    //Para mostrar los datos String - Solo el nombre que es particular de esta clase
    @Override
    public String toString() {
        return "Hija{" +
                "nombre='" + nombre + '\'' +
                "} " + super.toString();
    }
}
