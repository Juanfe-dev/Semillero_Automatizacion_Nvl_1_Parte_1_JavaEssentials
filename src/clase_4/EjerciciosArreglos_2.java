package clase_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosArreglos_2 {

    static Scanner scanner = new Scanner(System.in);;
    static String[][] matrizEstudiantesVsNotas;
    static int numeroEstudiantes;
    static int numeroNotas;
    static boolean continua = true;
    static double promedio;
    static double sumatotal;

    public static void main(String[] args) {
        try {
            hallarPromedio();
        } catch (InputMismatchException e){
            System.out.println("El valor ingresado no es valido, finalizando sistema de evaluación...");
            scanner = new Scanner(System.in);
            hallarPromedio();
        }
    }

    private static void hallarPromedio() {
        //Creación de matriz
        System.out.print("Ingrese el numero de estudiantes a registrar: ");
        numeroEstudiantes = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el numero de notas a registrar: ");
        numeroNotas = scanner.nextInt();
        scanner.nextLine();
        matrizEstudiantesVsNotas = new String[numeroEstudiantes][numeroNotas+1];
        continua = false;
        //Registro de nombres
        for (int i = 0; i < matrizEstudiantesVsNotas.length; i++) {
            System.out.print("Ingrese el nombre del estudiante "+(i+1)+": ");
            matrizEstudiantesVsNotas[i][0] = scanner.nextLine();
        }
        //Registro de notas
        for (int i = 0; i < matrizEstudiantesVsNotas.length; i++) {
            System.out.println("Ingrese las notas del estudiante "+matrizEstudiantesVsNotas[i][0]+": ");
            for (int j = 1; j < matrizEstudiantesVsNotas[i].length; j++) {
                try {
                    do {
                        matrizEstudiantesVsNotas[i][j] = scanner.nextLine();
                        if (Double.parseDouble(matrizEstudiantesVsNotas[i][j]) < 0 || Double.parseDouble(matrizEstudiantesVsNotas[i][j]) > 5) {
                            System.out.println("La nota debe estar entre 0.0 y 5.0 \n!Intente ingresar la nota " + j + " de nuevo por favor¡");
                        }
                    } while (Double.parseDouble(matrizEstudiantesVsNotas[i][j]) < 0 || Double.parseDouble(matrizEstudiantesVsNotas[i][j]) > 5);
                } catch (NumberFormatException ex){
                    System.out.println("El formato ingresado no es valido, reiniciando sistema de calificaciones...");
                    hallarPromedio();
                };
            }
        }
        //Impresión de matriz
        System.out.print("-----------------------------------------------------------------");
        for (int i = 0; i < matrizEstudiantesVsNotas.length; i++) {
            System.out.print("\nNotas de ");
            for (int j = 0; j < matrizEstudiantesVsNotas[i].length; j++) {
                System.out.print(matrizEstudiantesVsNotas[i][j]+" | ");
            }
        }
        System.out.print("\n-----------------------------------------------------------------");
        //Calculo promedio
        for (int i = 0; i < matrizEstudiantesVsNotas.length; i++) {
            System.out.print("\nEl estudiante "+"["+matrizEstudiantesVsNotas[i][0]+"] ");
            sumatotal = 0;
            promedio = 0;
            for (int j = 1; j < matrizEstudiantesVsNotas[i].length; j++) {
                sumatotal= sumatotal + Double.parseDouble(matrizEstudiantesVsNotas[i][j]);
                promedio = sumatotal/numeroNotas;
            }
            if ((promedio >= 3.0)&&(promedio <= 5.0)){
                System.out.print("APROBO con un promedio de: "+promedio);
            } else {
                System.out.print("REPROBO con un promedio de: "+promedio);
            }
        }
        System.out.println("\n-----------------------------------------------------------------");
    }
}



