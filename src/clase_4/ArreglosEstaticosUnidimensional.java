package clase_4;

public class ArreglosEstaticosUnidimensional {

    public static void main(String[] args) {

        //Unidimencional estatico
        int[] numeros = {10, 20, 40, 50};

        // numeros.length -> devuelve el tamaño del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //Otra manera de crear un arreglo solo especificando el tamaño
        String[] marcas = new String[4];
        marcas[0] = "BMW";
        marcas[1] = "Volvo";
        marcas[2] = "Ferrari";
        marcas[3] = "Mazda";

        for (int i = 0; i < marcas.length; i++) {
            System.out.println(marcas[i]);
        }

        /*
        Ejercicio:
            Crear un programa que se va a encargar de obtener el promedio de las notas
            de un estudiante, por favor ingrese la cantidad de notar por consola y el valor de cada nota.
            Es importante aclarar que las notas son de 0 a 5.

                 Solucion en la clase: EjercicioArreglos_1
         */



    }
}
