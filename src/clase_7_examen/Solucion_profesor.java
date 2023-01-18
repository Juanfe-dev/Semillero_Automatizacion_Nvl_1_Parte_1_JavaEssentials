package clase_7_examen;

import java.util.Scanner;
public class Solucion_profesor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cadenas = new String[2];
        System.out.println("Por favor ingrese la primera cadena separada por comas");
        cadenas[0] = scanner.nextLine();
        System.out.println("Por favor ingrese la segunda cadena separada por comas");
        cadenas[1] = scanner.nextLine();
        String[] aux = cadenas[0].replace(" ","").split(",");
        int[] enteroCadenas0 = new int[aux.length];
        for (int i = 0; i < aux.length; i++) {
            enteroCadenas0[i] = Integer.parseInt(aux[i]);
        }
        aux = cadenas[1].replace(" ","").split(",");
        int[] enteroCadenas1 = new int[aux.length];
        for (int i = 0; i < aux.length; i++) {
            enteroCadenas1[i] = Integer.parseInt(aux[i]);
        }
        for (int i = 0; i < enteroCadenas0.length; i++) {
            for (int j = 0; j < enteroCadenas0.length; j++) {
                if (enteroCadenas0[i] < enteroCadenas0[j]){
                    int auxInt = enteroCadenas0[j];
                    enteroCadenas0[j] = enteroCadenas0[i];
                    enteroCadenas0[i] = auxInt;
                }
            }
        }
        for (int i = 0; i < enteroCadenas1.length; i++) {
            for (int j = 0; j < enteroCadenas1.length; j++) {
                if (enteroCadenas1[i] < enteroCadenas1[j]){
                    int auxInt = enteroCadenas1[j];
                    enteroCadenas1[j] = enteroCadenas1[i];
                    enteroCadenas1[i] = auxInt;
                }
            }
        }
        String respuesta = "";
        for (int i = 0; i < enteroCadenas0.length; i++) {
            for (int j = 0; j < enteroCadenas1.length; j++) {
                if (enteroCadenas0[i] == enteroCadenas1[j]){
                    //respuesta += ""+enteroCadenas0[i];
                    respuesta += String.valueOf(enteroCadenas0[i]+ ", ");
                }
            }
        }
        if (respuesta.isEmpty()){
            respuesta = "false";
            System.out.println(respuesta);
        }else
            System.out.println(respuesta.substring(0, respuesta.length()-2));
    }
}