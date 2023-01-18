package clase_12.ejercicioParqueadero.solucionPropia;

public class Parqueadero {

    private final Vehiculo[] parqueadero;

    public Parqueadero(int tamaño){
        parqueadero = new Vehiculo[tamaño-1];
    }

    public Vehiculo[] getParqueadero() {
        return parqueadero;
    }
    public int getTamañoParqueadero() {
        return parqueadero.length;
    }
}
