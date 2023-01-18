package clase_12.ejercicioParqueadero.solucionPropia;

public class Moto extends Vehiculo {

    private double cilindraje;
    final static int ESPACIO_MOTO = 1;

    public Moto(String placa, String color, String marca, double valorHora, String horaIngreso, double cilindraje){
        super(placa, color, marca, valorHora, ESPACIO_MOTO, horaIngreso);
        this.cilindraje = cilindraje;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
}
