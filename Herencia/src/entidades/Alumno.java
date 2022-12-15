package entidades;

//Heredamos o extendemos de la clase Padre "Persona"
public class Alumno extends Persona {

    //Añadimos nuestro atributo particular de la clase hija
    //Podemos utilizar cualquier modificar de acceso - Por buena practica ocupamos protected
    protected String Materia;

    //Utilizamos el constructor de la clase Padre -
    // Haciendo referencia con la palabra reservada super que ocupamos su mismo constructor con parametros
    //Añadiendo particularmente solo nuestro atributo "Materia"
    public Alumno(String nombre, String apellido, String Materia) {
        super(nombre, apellido);
        this.Materia = Materia;
    }

    //Metodo de la clase hija
    public void DarPresente(){
        System.out.println("Presente");
    }

    //Sobreescritura o reutilizacion del codigo de la clase Padre de su metodo Saludar -
    // Cambiando su salida por "chau"
    @Override
    public void saludar() {
        System.out.println("Chau");
    }

    //toString para mostrar solamente el atributo de la clase hija "Materia",
    // ya que al heredar de la clase padre tambien nos mostraria el toString de allí
    @Override
    public String toString() {
        return "Alumno{" +
                "Materia='" + Materia + '\'' +
                "} " + super.toString();
    }
}
