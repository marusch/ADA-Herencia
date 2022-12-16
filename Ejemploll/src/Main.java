import entidades.Auto;
import entidades.Transporte;

public class Main {
    public static void main(String[] args) {

        //Instancia y primer objeto de la clase Padre
        Transporte transporte1 = new Transporte("5");
        System.out.println(transporte1 + " asientos");
        transporte1.Velocidad();

        //Instancia y primero objeto de la clase Hija
        Auto auto1 = new Auto("5", 2018); //Utilizando atributo heredado del padre y el propio
        System.out.println(auto1 + " asientos");
        auto1.Velocidad(); //Utilizando el metodo heradado, cambiando su retorno
    }
}