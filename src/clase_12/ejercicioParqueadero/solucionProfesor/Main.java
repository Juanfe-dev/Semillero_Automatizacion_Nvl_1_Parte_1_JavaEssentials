package clase_12.ejercicioParqueadero.solucionProfesor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Parqueadero miParqueadero;

    public static void main(String[] args) {
        System.out.println("Por favor ingrese el tamaño del parqueadero");
        int espaciototal = scanner.nextInt();
        scanner.nextLine();
        miParqueadero = new Parqueadero(espaciototal);
        System.out.println("Bienvenido al parqueadero del semillero");
        int opcion;
        while (true) {
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("\t2. Ingresar un vehiculo");
            System.out.println("\t3. Calcular precio de salida de un vehiculo");
            System.out.println("\t4. Retirar un vehiculo");
            System.out.println("\t5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 2:
                    ingresarVehiculo();
                    break;
                case 3:
                    calcularPrecioSalida();
                    break;
                case 4:
                    retirarVehiculo();
                    break;
                case 5:
                    System.out.println("Programa finalizado con exito...");
                    System.exit(0);
            }
        }
    }
    private static void ingresarVehiculo() {
        System.out.println("Ingrese la placa del vehiculo a ingresar: ");
        String placa = scanner.nextLine();
        int opcion;
        if(miParqueadero.vehiculoExisteEnElParqueadero(placa)){
            System.out.println("Este vehiculo ya fue ingresado previamente!");
        } else {
            System.out.println("Por favor ingrese el color del vehiculo: ");
            String color = scanner.nextLine();
            System.out.println("Por favor ingrese la marca del vehiculo: ");
            String marca = scanner.nextLine();
            System.out.println("Por favor ingrese el modelo del vehiculo: ");
            String modelo = scanner.nextLine();

            System.out.println("Seleccione el tipo de vehiculo a ingresar");
            System.out.println("\t1. Moto");
            System.out.println("\t2. Carro");
            System.out.println("\t3. Camioneta");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Por favor ingrese el cilindraje: ");
                    int cilindraje = scanner.nextInt();
                    scanner.nextLine();
                    Vehiculo moto = new Moto(placa, color, marca, modelo, cilindraje);
                    miParqueadero.guardarVehiculo(moto);
                    break;
                case 2:
                    System.out.println("Por favor ingrese el tamaño: ");
                    String tamano = scanner.nextLine();
                    Vehiculo carro = new Carro(placa, color, marca, modelo, tamano);
                    miParqueadero.guardarVehiculo(carro);
                    break;
                case 3:
                    System.out.println("Por favor ingrese el numero de puertas: ");
                    int numeroPuertas = scanner.nextInt();
                    scanner.nextLine();
                    Vehiculo camioneta = new Camioneta(placa, color, marca, modelo, numeroPuertas);
                    miParqueadero.guardarVehiculo(camioneta);
                    break;

            }
        }
    }

    private static void calcularPrecioSalida() {
        System.out.println("Ingrese la placa para calcular precio: ");
        String placa = scanner.nextLine();
        Date fechaFinal = pedirFecha();
        System.out.println( miParqueadero.calcularPrecio(placa, fechaFinal));
    }

    private static Date pedirFecha() {
        while (true) {
            System.out.println("Por favor ingrese la fecha en formato dd/mm/aaaa HH:mm:ss (12/12/2022 13:00:40)");
            String fecha = scanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            try {
                return simpleDateFormat.parse(fecha);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor ingrese una fecha y hora validas");
            }
        }
    }

    private static void retirarVehiculo() {
        System.out.println("Ingrese la placa del vehiculo a retirar: ");
        String placa = scanner.nextLine();
        Date fechaFinal = pedirFecha();
        miParqueadero.retirarVehiculo(placa, fechaFinal);
    }
}
