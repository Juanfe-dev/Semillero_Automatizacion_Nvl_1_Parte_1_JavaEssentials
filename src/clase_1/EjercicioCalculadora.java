package clase_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioCalculadora {

    static Scanner entradaValor = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    public static void Suma() {
        System.out.print("Ingrese el primer numero: ");
        double numeroUno = entradaValor.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        double numeroDos = entradaValor.nextInt();
        double suma = numeroUno + numeroDos;
        System.out.println("La suma es: " + suma + "\n");
    }

    public static void Resta() {
        System.out.print("Ingrese el primer numero: ");
        double numeroUno = entradaValor.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        double numeroDos = entradaValor.nextInt();
        double resta = numeroUno - numeroDos;
        System.out.println("La resta es: " + resta + "\n");
    }

    public static void Multiplicacion() {
        System.out.print("Ingrese el primer numero: ");
        double numeroUno = entradaValor.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        double numeroDos = entradaValor.nextInt();
        double multiplicacion = numeroUno * numeroDos;
        System.out.println("La multiplicación es: " + multiplicacion + "\n");
    }

    public static void Division() {
        System.out.print("Ingrese el primer número: ");
        double numeroUno = entradaValor.nextInt();
        System.out.print("Ingrese el segundo número: ");
        double numeroDos = entradaValor.nextInt();
        double division = numeroUno / numeroDos;
        System.out.println("La división es: " + division + "\n");
    }

    public static void Menu() {
        boolean continuar = true;
        while(continuar){
            try {
                Scanner opcionUsuario = new Scanner(System.in);
                System.out.println("Escriba el número de la operación deseada\n");
                System.out.println("1: Suma\n2: Resta\n3: Multiplicación\n4: División\n5: Cerrar calculadora\n");
                int opcion = opcionUsuario.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Calculadora de suma\n");
                        Suma();
                        continuar = true;
                        break;
                    case 2:
                        System.out.println("Calculadora de resta\n");
                        Resta();
                        continuar = true;
                        break;
                    case 3:
                        System.out.println("Calculadora de multiplicación\n");
                        Multiplicacion();
                        continuar = true;
                        break;
                    case 4:
                        System.out.println("Calculadora de división\n");
                        Division();
                        continuar = true;
                        break;
                    case 5:
                        System.out.println("Aplicación finalizada...");
                        continuar = false;
                        System.exit(0);
                    default:
                        Menu();
                }
            }
            catch(InputMismatchException ex){
                System.out.println("Ingrese una opcion correcta.\n");
                Menu();
            }
        }
    }
}
