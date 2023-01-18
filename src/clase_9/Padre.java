package clase_9;

import java.util.List;

public class Padre {

    String nombre;
    int edad;

    public Padre(String nombre){
        this.nombre = nombre;
    }



    public void decirNombre() {
        System.out.println("Mi nombre es: " + nombre);
    }
}
