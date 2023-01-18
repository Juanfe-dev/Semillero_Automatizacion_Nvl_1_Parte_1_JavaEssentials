package clase_12.ejercicioParqueadero.solucionProfesor;

import java.time.Instant;
import java.util.Date;

public class Carro extends Vehiculo {

    private String tamano;

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Carro(String color, String marca, String modelo, String placa, String tamano) {
        super(color, marca, modelo, placa, 2);
        this.tamano = tamano;
    }

    @Override
    public int setPrecioHora() {
        switch(tamano){
            case "pequeño":
                return 3000;
            case "mediano":
                return 4000;
            case "grande":
                return 5000;
        }
        return 0;
    }
}
