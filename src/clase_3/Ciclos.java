package clase_3;

import java.util.Scanner;

public class Ciclos {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        String mes = scanner.next();
        //Ciclo while
        while (mes.equals("enero")){
            System.out.println("Ingrese otro mes: ");
            mes = scanner.next();
        }
        //Ciclo infinito
        //int num = 0;
        //while(num < 15){
        //    System.out.println(num);
        //}
        //Contador while de incremento
        int num2 = 0;
        while(num2 < 15){
            System.out.println(num2);
            num2++;
        }
        //Contador while de decremento
        int num3 = 15;
        while(num3 > 0){
            System.out.println(num3);
            num3--;
        }
        //Do while
        int num4 = 0;
        do {
            System.out.println("Do while: "+num4);
            num4++;
        } while (num4 < 15);
        //For i
        for(int i = 0; i < 15; i++ ){
            System.out.println("Contador for: "+i);
        }
        //For i con incremento de a 2
        for(int i = 0; i < 15; i=1+2 ){
            System.out.println("Contador for: "+i);
        }
        //For i con decremento
        for(int i = 15; i > 0; i-- ){
            System.out.println("Contador for: "+i);
        }
        //For i con el uso de break
        for(int i = 0; i < 15; i++ ){
            System.out.println("Contador for: "+i);
            if(i == 10) break;
        }
        System.out.println("Continuación despues del break aquí.");
        //For i con el uso del continue
        for(int i = 0; i < 15; i++ ){
            if(i == 10) continue;
            //Salta a la siguiente iteracion y no imprime el 10
            System.out.println("Contador for: "+i);
        }


    }
}
