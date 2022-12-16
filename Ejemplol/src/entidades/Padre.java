package entidades;

//Podemos denominarlo como clase Padre, SuperClase o Clase Objeto
public class Padre {

    //Atributo de la clase Padre
    protected String apellido;

    //Constructor
    public Padre(String apellido) {
        this.apellido = apellido;
    }

    //Metodo de la clase Padre
    public void Accion(){
        System.out.println("Estoy caminando");
    }

    //Para mostrar los datos String
    @Override
    public String toString() {
        return "Padre{" +
                "apellido='" + apellido + '\'' +
                '}';
    }
}
