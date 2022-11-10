package clase_2;

public class Operadores {
    public static void main(String[] args) {
        //Operadores
            // Modulo % o residuo
            int residuo = 7%2;
            System.out.println(residuo);
            //Incremental
            residuo++;
            System.out.println("Incrementar: "+residuo);
            //Decremental
            residuo--;
            System.out.println("Decrementar: "+residuo);
        //Tipos de datos
            //byte - (0 a 127)
            byte byteEjemplo = 127;
            System.out.println(byteEjemplo);
            //decimal - double, finaliza en d para dar el valor completo
            double decimal = 7/2d;
            System.out.println(decimal);
            //char - caracter, utiliza solo comilla simple ''
            char caracter = 'a';
            System.out.println(caracter);
            //boolean - logico, (0 o 1  | false o true)
            boolean bandera = true;
            System.out.println(bandera);
            boolean bandera2 = decimal == 3.5;
            System.out.println(bandera2);
        //Conversion de datos
            //Casting automatico
                //El de la izquierda cabe en los de la derecha
                //byte -> short -> int -> long -> float ->  double
                double valor200 = 200;
                //int valorEntero = valor200; no puedo almacenar un double en un int
                short valor10 = 10;
                double valorDouble = valor10; //Si puedo almacenar un short en un double
            //Casting manual
                double valor300 = 300;
                float valor300aFloat = (float) valor300;
                System.out.println(valor300aFloat);
            //Parseando datos, ej de int a string
                String numeroTexto = "1257";
                int parseo = Integer.parseInt(numeroTexto); //convierte el string en int

                int numeroEntero = 123;
                String aTexto = numeroTexto.toString(); //convierte del int a string
    }
}
