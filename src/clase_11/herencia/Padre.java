package clase_11.herencia;

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
