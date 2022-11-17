package clase_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosArreglos_2_Profesor {

    public static void main(String[] args){
        // Hacer un programa que me registre los siguientes datos de los alumnos
        // 1. Nombre
        // 2. las notas entre 0 y 5 (todos los alumnos deben tener la misma cantidad de notas
        // 3. Ingresar el promedio
        // Debemos especificar los alumnos que ganaron y los que perdieron (se gana a partir de 3)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el número de alumnos");
        int cantidadAlumnos = scanner.nextInt();
        System.out.println("Ingresar la cantidad de notas");
        int cantidadNotas = scanner.nextInt();
        String[][] materia = new String[cantidadAlumnos][cantidadNotas+2];
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Por favor ingrese el nombre del alumno");
            materia[i][0] = scanner.next();
            int sumNotas = 0;
            for (int j = 1; j < materia[i].length-1; j++) {
                int nota;
                do {
                    System.out.println("Por favor ingrese la nota " + j + " entre 0 y 5");
                    materia[i][j] = scanner.next();
                    nota = Integer.parseInt(materia[i][j]);
                }while (nota < 0 || nota > 5);
                sumNotas += nota;
            }
            double promedio = (double) sumNotas/cantidadNotas;
            System.out.println("El promedio es " + promedio);
            // La columna de promedio es cantidadNotas + 1
            materia[i][cantidadNotas+1] = String.valueOf(promedio);
        }
        for (int i = 0; i < cantidadAlumnos; i++) {
            double promedio = Double.parseDouble(materia[i][cantidadNotas+1]);
            if (promedio >= 3)
                System.out.println("El alumno " + materia[i][0] + " pasó la materia con " + promedio);
            else
                System.out.println("El alumno " + materia[i][0] + " perdió la materia con " + promedio);
        }
    }

}



