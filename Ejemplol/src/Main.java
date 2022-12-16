import entidades.Hija;
import entidades.Padre;

public class Main {
    public static void main(String[] args) {

        //Instancia y primer objeto de la clase Padre
        Padre padre = new Padre("Perez");
        System.out.println(padre);
        padre.Accion();

        //Instancia y primer objeto de la clase Hija
        Hija hija = new Hija("Perez","Catalina"); //Utilizando el codigo heredado
        System.out.println(hija);
        hija.Accion(); //Utilizando metodo heredado y cambiando su accion

    }
}