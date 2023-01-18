package clase_12.ejercicioParqueadero.solucionPropia;

public class Carro extends Vehiculo {

    private String tamaño;
    final static int ESPACIO_CARRO = 2;

    public Carro(String placa, String color, String marca, double valorHora, String horaIngreso, String tamaño) {
        super(placa, color, marca, valorHora, ESPACIO_CARRO, horaIngreso);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
