package clase_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioArreglos_1 {

    static Scanner scanner = new Scanner(System.in);
    static int notas;
    static double[] totalNotas;
    static double sumaNotas;

    static double promedioNotas;

    public static void main(String[] args){
        guardarNotas();
        hallarPromedio();
    }

    private static void guardarNotas() {
            System.out.print("Por favor ingrese la cantidad de notas: ");
            notas = scanner.nextInt();
            totalNotas = new double[notas];
            for (int i = 0; i < totalNotas.length; i++) {
                do {
                    System.out.print("Por favor ingrese el valor de 0 a 5 de la nota " + (i+1) + ": " );
                    totalNotas[i] = scanner.nextDouble();
                } while(totalNotas[i]<0 || totalNotas[i]>5);
            }
    }

    private static void hallarPromedio() {
        sumaNotas = 0;
        for (int i = 0; i < totalNotas.length; i++) {
            sumaNotas = sumaNotas + totalNotas[i];
        }
        promedioNotas = sumaNotas/ totalNotas.length;
        System.out.println("El promedio de las notas es: "+promedioNotas);
    }
}
