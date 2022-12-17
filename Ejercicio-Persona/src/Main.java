import entidades.Persona;
import entidades.ProfMaru;

public class Main {
    public static void main(String[] args) {

        Persona person1 = new Persona("Fer");
        System.out.println(person1);
        person1.Saludar();

        ProfMaru profMaru = new ProfMaru("Maru", "Schuindt");
        System.out.println(profMaru);
        profMaru.Saludar();
    }
}