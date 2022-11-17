package clase_4;

import java.util.Scanner;

public class ArreglosEstaticosMultidimensional {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //Matriz de dos dimensiones
        int[][] matriz = {{2,4},{6,5}};
        for (int i = 0; i < matriz.length; i++) { // matriz.length retorna 2, dos vectores
            for (int j = 0; j < matriz[i].length; j++) { // matriz[i].length retorna 2, tamaño de cada vector
                System.out.println(matriz[i][j]);
            }
        }

        //Matriz de tres dimensiones
        int[][][] matriz3= {{{2,4},{6,5}},{{2,4},{6,5}}};
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                for (int k = 0; k < matriz3[i][j].length; k++) {
                    System.out.println(matriz3[i][j][k]);
                }
            }
        }

        /*
        * Ejercicio:
        *   Crear un programa que me registre los siguientes datos de los alumnos
        * 1. Nombre
        * 2. Las notas de 0 a 5 (Todos los alumnos deben de tener la misma cantidad de notas)
        * 3. Ingresar el promedio
        *
        * Debemos especificar los alumnos que ganaron y los que perdieron
        * (se gana a partir de 3)
        * */
    }
}
