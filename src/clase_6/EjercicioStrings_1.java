package clase_6;

import java.util.Scanner;

/*
* Ejercicio:
* Determine si una cadena es un nombre de usuario válido
* de acuerdo con las siguientes reglas:
* 1. El nombre de usuario tiene entre 4 y 25 caracteres.
* 2. Debe comenzar con una letra.
* 3. Solo puede contener letras, números y el carácter de guión bajo.
* 4. No puede terminar con un carácter de subrayado.
* */

public class EjercicioStrings_1 {

    static Scanner scanner = new Scanner(System.in);
    static String qwertyQWERTY = "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM";
    public static void main(String[] args){
        System.out.print("Ingrese el nombre a validar: ");
        usuarioValido(scanner.nextLine());
    }

    private static void usuarioValido(String usuario) {
        boolean valido = true;
        System.out.println("El usuario: "+usuario);
        if ((usuario.length() > 3)&&(usuario.length() < 26)){
            System.out.println("1. Contiene entre 4 y 25 caracteres: ["+usuario.length()+"]");
            valido = true;
        } else {
            System.out.println("No cumple la longitud.\nNo es valido.");
            valido = false;
            return;
        }

        if (usuario.substring(0,1).matches("^[a-zA-Z]")){
            System.out.println("2. Comienza por una letra");
            valido = true;
        } else {
            System.out.println("No comienza por una letra\nNo es valido.");
            valido = false;
            return;
        }

        if (usuario.matches("\\w*")){
            System.out.println("3. Contiene letras, numeros y guion bajo");
            valido = true;
        } else {
            System.out.println("No solo contiene letras, numeros y/o guion bajo\nNo es valido.");
            valido = false;
            return;
        }

        if (!usuario.endsWith("_")){
            System.out.println("4. No termina en _");
            valido = true;
        } else {
            System.out.println("Termina en _\nNo es valido.");
            valido = false;
            return;
        }

        if (valido == true){
            System.out.println("El usuario "+usuario+" es valido.");
        } else {
            System.out.println("El usuario "+usuario+" NO es valido.");
        }
    }
}




