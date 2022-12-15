import entidades.Alumno;
import entidades.Persona;

public class Main {
    public static void main(String[] args) {

	    //Primer instancia y objeto de la clase Padre
        Persona person1 = new Persona("Maru", " Schuindt");
	    System.out.println(person1); //Mostramos la persona con sus atributos gracias al toString

	    //Segunda instancia y segundo objeto
        Persona person2 = new Persona("Fer", "Silvero");
	
	    //Metodo saludar de la clase Padre para los dos objetos creados
        person1.saludar();
	    person2.saludar();


	    //Primer instancia y objeto de la clase Hija
        Alumno alumno1 = new Alumno("Fer","Silvero", "Ingles");

        //Mostramos el alumno con sus atributos heredados de la clase Persona o Padre
        // y su atributo propio "Materia"
        System.out.println(alumno1);

        alumno1.DarPresente(); //Metodo de la clase hija

        //Metodo de la clase Padre heredado por la hija, cambiando su salida o reutilizando codigo
	    alumno1.saludar();


	    //** Recordemos que al hereder de la clase padre podemos ocupar sus constructores,
        // atributos y metodos en la clase hija **

        //----------------------------------------------------------------------------//
	    //* Otros ejemplos que proporciona la clase Object para utilidad *
	    //Equals - Nos compara si el objeto person1 es igual al objeto person2 creado posteriormente
        System.out.println(person1.equals(person2));

        //HashCode - Nos proporciona un codigo identificador para cada objeto
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());


    }
}