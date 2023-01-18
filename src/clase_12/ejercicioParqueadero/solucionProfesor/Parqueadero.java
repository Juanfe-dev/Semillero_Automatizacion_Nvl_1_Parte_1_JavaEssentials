package clase_12.ejercicioParqueadero.solucionProfesor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parqueadero {
    private int espacioTotal;
    private List<Vehiculo> listaVehiculos;

    public Parqueadero(int espacioTotal) {
        this.espacioTotal = espacioTotal;
        listaVehiculos = new ArrayList<>();
    }

    public boolean vehiculoExisteEnElParqueadero(String placa) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }

    public int calcularEspacioDisponible() {
        int espacioOupado = 0;
        for (Vehiculo vehiculo : listaVehiculos) {
            espacioOupado += vehiculo.getEspacioOcupado();
        }
        return espacioTotal - espacioOupado;
    }

    public void guardarVehiculo(Vehiculo vehiculo) {
        int espacioDisponible = calcularEspacioDisponible();

        if (vehiculoExisteEnElParqueadero(vehiculo.getPlaca())) {
            System.out.println("Ya hay un vehiculo con esa placa, llamar a la policia!");
            return;
        }
        if (vehiculo.getEspacioOcupado() <= espacioDisponible) {
            listaVehiculos.add(vehiculo);
            System.out.println("El vehiculo fué guardado con exito, quedan "
                    + calcularEspacioDisponible() + " espacio(s).");
        } else {
            System.out.println("No hay espacio para almacenar este vehiculo!");
        }
    }

    public int calcularPrecio(String placa, Date fechaTentativaSalida) {
        if (vehiculoExisteEnElParqueadero(placa)) {
            Vehiculo vehiculoCalcular = buscarVehiculo(placa);
            long diferenciaMillis = fechaTentativaSalida.getTime() -
                    vehiculoCalcular.getHoraIngreso().getTime();
            double diferenciaHoras = (((double) diferenciaMillis / (1000 * 60 * 60)));
            System.out.println("Se redondea las horas hacia arriba, pasa de "
                    + diferenciaHoras + " a " + Math.ceil(diferenciaHoras));
            return (int) (vehiculoCalcular.getPrecioHora() * Math.ceil(diferenciaHoras));
        }
        System.out.println("El vehiculo no existe");
        return -1;
    }

    public void retirarVehiculo(String placa, Date fechaTentativaSalida) {
        int precioTotal = calcularPrecio(placa, fechaTentativaSalida);

        if (precioTotal > 0) {
            System.out.println("El precio a pagar es " + precioTotal);
            Vehiculo vehiculoRetirar = buscarVehiculo(placa);
            listaVehiculos.remove(vehiculoRetirar);
            System.out.println("El vehiculo ha sido retirado.");
        }
    }

    private Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                return vehiculo;
            }
        }
        return null;
    }
}
