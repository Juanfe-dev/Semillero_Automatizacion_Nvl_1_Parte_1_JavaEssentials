package clase_12.ejercicioParqueadero.solucionPropia;

public class Camioneta extends Vehiculo {

    private int numeroDePuertas;
    final static int ESPACIO_CAMIONETA = 4;

    public Camioneta(String placa, String color, String marca, double valorHora, String horaIngreso, int numeroDePuertas) {
        super(placa, color, marca, valorHora, ESPACIO_CAMIONETA, horaIngreso);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
}
