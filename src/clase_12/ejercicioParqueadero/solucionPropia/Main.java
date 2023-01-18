package clase_12.ejercicioParqueadero.solucionPropia;

import java.util.Scanner;

public class Main {

    static Parqueadero parqueadero;
    static Scanner scanner = new Scanner(System.in);
    static int tamañoParqueadero;
    private static boolean continuar = true;
    private static int espacioOcupado;
    private static int espacioRestante;

    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {

        crearParqueadero();
        while (continuar) {
            calcularEspacioRestante();
            if (espacioOcupado <= parqueadero.getTamañoParqueadero()) {
                ingresarVehiculo();
            } else {
                continuar = false;
            }
        }
        System.out.println("Espacios ocupados: " + espacioOcupado);
    }

    public static int calcularEspacioRestante() {
        return parqueadero.getTamañoParqueadero() - espacioOcupado;
    }

    private static void ingresarVehiculo() {
        System.out.println("¿Que desea hacer?");
        System.out.println("\t1. Ingresar moto");
        System.out.println("\t2. Ingresar carro");
        System.out.println("\t3. Ingresar camioneta");
        System.out.println("\t4. Finalizar el programa");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                if (espacioRestante >= 1) {
                    espacioOcupado += 1;
                    System.out.println("Espacio restante en moto: " + espacioRestante);
                    System.out.println("La moto ha sido ingresada con exito...");
                    break;
                } else {
                    System.out.println("No es posible ingresar mas motos");
                    break;
                }

            case 2:
                if (espacioRestante >= 2) {
                    espacioOcupado += 2;
                    System.out.println("Espacio restante en carro: " + espacioRestante);
                    System.out.println("El carro ha sido ingresado con exito...");
                    break;
                } else {
                    System.out.println("No es posible ingresar mas carros");
                    break;
                }

            case 3:
                if (espacioRestante >= 4) {
                    espacioOcupado += 4;
                    System.out.println("Espacio restante en camioneta: " + espacioRestante);
                    System.out.println("La camioneta ha sido ingresada con exito...");
                    break;
                } else {
                    System.out.println("No es posible ingresar mas camionetas");
                    break;
                }

            case 4:
                System.out.println("Aplicación de parqueadero finalizada con exito...");
                System.exit(0);
                break;
        }
    }

    public static void crearParqueadero() {
        System.out.println("Bienvenido al menu de creacion de parqueadero");
        System.out.println("Por favor ingrese los espacios del parqueadero: ");
        tamañoParqueadero = scanner.nextInt();
        parqueadero = new Parqueadero(tamañoParqueadero);
        System.out.println("Parqueadero creado exitosamente con " + parqueadero.getTamañoParqueadero() + " espacios.");
        System.out.println("----------------------------------------------");
    }
}
