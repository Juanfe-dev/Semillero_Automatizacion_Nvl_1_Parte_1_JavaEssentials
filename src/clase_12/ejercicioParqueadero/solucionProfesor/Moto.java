package clase_12.ejercicioParqueadero.solucionProfesor;

import java.time.Instant;
import java.util.Date;

public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(String color, String marca, String modelo, String placa, int cilindraje) {
        super(color, marca, modelo, placa, 1);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }


    @Override
    public int setPrecioHora() {
       if(cilindraje > 300){
           return 3000;
       } else {
           return 1000;
       }
    }
}
