package clase_12.ejercicioParqueadero.solucionProfesor;

import java.time.Instant;
import java.util.Date;

public class Camioneta extends Vehiculo {

    private int numeroPuertas;

    public Camioneta(String color, String marca, String modelo, String placa,  int numeroPuertas) {
        super(color, marca, modelo, placa, 4);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public int setPrecioHora() {
        if(numeroPuertas>4){
            return 8000;
        } else {
            return 6000;
        }
    }
}
