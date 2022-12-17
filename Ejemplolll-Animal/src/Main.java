import entidades.Animal;
import entidades.Gato;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Jerry");
        System.out.println(animal1);
        animal1.Accion();

        Gato gati1 = new Gato("Pelusa","Naranja");
        System.out.println(gati1);
        gati1.Accion();

    }
}