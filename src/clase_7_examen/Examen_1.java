package clase_7_examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Examen_1 {


    public static void main(String[] args) {
        //Ingreso de las dos secuencias de numeros iniciales
        Scanner scanner = new Scanner(System.in);
        String secuenciaEntrada1;
        String secuenciaEntrada2;

        System.out.println("Ingrese los primeros valores separados por coma: ");
        secuenciaEntrada1 = scanner.nextLine();
        System.out.println("\n--------------------------------------------------");
        System.out.println("Ingrese los segundos valores separados por coma: ");
        secuenciaEntrada2 = scanner.nextLine();
        System.out.println("\n--------------------------------------------------");

        //Almacenamiento de las secuencias a vectores
        int[] vector1 = convertirStringConComaAVector(secuenciaEntrada1);
        int[] vector2 = convertirStringConComaAVector(secuenciaEntrada2);

        //Ordenamiento de los vectores con metodo burbuja
        ordenamientoAscendenteBurbuja(vector1);
        ordenamientoAscendenteBurbuja(vector2);

        //Comparacion de los textos
        filtrarNumerosRepetidos(vector1, vector2);

    }

    static void ordenamientoAscendenteBurbuja(int[] arreglo) {
        for (int i = arreglo.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    intercambiar(arreglo, j, j + 1);
                }
            }
        }
    }

    private static void intercambiar(int[] arreglo, int i, int j) {
        int aux;
        aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    public static int[] convertirStringConComaAVector(String secuencia) {
        String[] aux = secuencia.replace(" ", "").split(",");
        int[] vector = new int[aux.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(aux[i]);
        }
        return vector;
    }

    public static void filtrarNumerosRepetidos(int[] vector1, int[] vector2) {
        ArrayList<Integer> ubicacionRepetidos = new ArrayList();
        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]) {
                    ubicacionRepetidos.add(i);
                }
            }
        }
        int[] numerosRepetidos = new int[ubicacionRepetidos.size()];
        for (int i = 0; i < ubicacionRepetidos.size(); i++) {
            numerosRepetidos[i] = vector1[ubicacionRepetidos.get(i)];
        }
        if (numerosRepetidos.length == 0) {
            System.out.println("No hay numeros repetidos entre los dos vectores.");
        } else {
            System.out.println("Los numeros repetidos en orden ascendente son: ");
            for (int i = 0; i < numerosRepetidos.length; i++) {
                System.out.print(numerosRepetidos[i] + " ");
            }
        }
    }
}

