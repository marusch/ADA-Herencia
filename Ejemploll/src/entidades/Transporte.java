package entidades;

//Podemos denominarlo como clase Padre, SuperClase o Clase Objeto
public class Transporte {

    //Atributo de la clase Padre
    protected String asientos;

    //Constructor de la clase Padre
    public Transporte(String asientos) {
        this.asientos = asientos;
    }

    //Metodo con tipo de dato, de la clase Padre
    public int Velocidad(){
        int Velocidad = 50;
        System.out.println("Estoy conduciendo a velocidad media " + Velocidad + " K/h");
        return Velocidad;
    }

    //Para mostrar como string los atributos
    @Override
    public String toString() {
        return "Transporte " +
                "asientos='" + asientos + '\'';
    }
}
