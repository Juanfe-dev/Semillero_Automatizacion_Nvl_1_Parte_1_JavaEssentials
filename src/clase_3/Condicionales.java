package clase_3;

import java.util.Locale;
import java.util.Scanner;

public class Condicionales {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Condicionales
        //if
        int num = 6;
        if (num % 3 == 0) {
            System.out.println("El " + num + " es multiplo de 3");
            //if anidado
            if (num % 2 == 0) {
                System.out.println("El " + num + " tambien es multiplo de 2");
            }
        }
        //else
        else {
            System.out.println("El " + num + " no es multiplo  de 3");
        }
        ;

        //Ejercicio: numero mayor entre a y b
        int numA, numB;
        System.out.println("Ingrese el primer valor");
        numA = scanner.nextInt();
        System.out.println("Ingrese el segundo valor");
        numB = scanner.nextInt();
        if (numA > numB) {
            System.out.println("El número " + numA + " es mayor que " + numB);
        } else if (numA == numB) {
            System.out.println("El número " + numA + " es igual que " + numB);
        } else {
            System.out.println("El número " + numB + " es mayor que " + numA);
        }

        //Switch
        int numero = 5;
        switch (numero) {
            case 10:
                System.out.println("El número es 10");
                break;
            case 5:
                System.out.println("El número es 5");
                break;
            default:
                System.out.println("No tengo ese número mapeado");
        }

        //Condicional de una sola linea
        //Solo funciona para una sentencia por bloque condicional
        //Esto equivale al switch anterior
        if (numero == 10)
            System.out.println("El número es 10");
        else if (numero == 5)
            System.out.println("El numero es 5");
        else
            System.out.println("No tengo ese número mapeado");

        //Switch con string
        //Tener cuidado con el manejo de mayus o minus
        String texto = "Semillero 12";
        switch (texto) {
            case "Semillero 12":
                System.out.println("Estamos en la clase 3 del semi");
                break;
            case "Automatización en Java":
                System.out.println("Estamos viendo un curso de automatización");
                break;
        }

        //Comparacion de strings, no usamos el ==
        if (texto.equals("Semillero 12"))
            System.out.println("Dice correctamente la palabra: " + texto);

        //Comparacion de strings, ignorando mayus y minus
        if (texto.equalsIgnoreCase("SEMILLERO 12"))
            System.out.println("Dice correctamente la palabra ignorando si es mayus o minus: " + texto);

        //Ejemplo
        System.out.println("Ingrese un mes para verificar su estación: ");
        String mes = scanner.next();
        switch (mes) {
            case "enero":
            case "febrero":
            case "marzo":
                System.out.println("La primavera");
                break;
            case "abril":
            case "mayo":
            case "junio":
            case "julio":
                System.out.println("El verano");
                break;
        }
    }
}
