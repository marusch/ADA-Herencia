package entidades;

//Heredamos de Transporte sus atributos y metodos
public class Auto extends Transporte{
    //Atributos de la clase hija
    protected int año;

    //Constructor heredado y sobreescrito con su atributo de clase hija
    public Auto(String asientos, int año) {
        super(asientos);
        this.año = año;
    }

    //Metodo con tipo de dato heredado de la clase Padre, y sobreescrito cambiando su retorno
    @Override
    public int Velocidad() {
        int Velocidad = 100;
        System.out.println("Puedo ir a una velocidad alta " + Velocidad + " K/h");
        return Velocidad;
    }

    //Para mostrar como string los atributos
    @Override
    public String toString() {
        return "Auto" +
                " año=" + año + '\n' + super.toString();
    }
}
