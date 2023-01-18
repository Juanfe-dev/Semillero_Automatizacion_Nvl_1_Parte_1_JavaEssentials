package clase_11.modificadores.sin_acceso;

//Modificador final -> no puede ser heredada entonces por el hijo
//public final class Padre {
public class Padre {

    public static String apellidos; //Puede ser accedido desde cualquier parte del codigo
    //Ya que es publico y es estatico

    final static String CONSTANTE_SEPARADA_POR_GUION_BAJO = "Valor constante";
    //final + static es conocido como constante
    //No cambiaran bajo ningun motivo


    //Variable de tipo final -> no puede ser sobreescrito
    //Este atributo solo puede ser modificado/asignado por el CONSTRUCTOR
//    final String nombre;
    private String nombre;
    String nombreHerencia;

    public Padre(String nombre) {
        this.nombre = nombre;
    }

//    public Padre(String nombre){ //CONSTRUCTOR
//        this.nombre = nombre;
//    }

    //Metodo de tipo final -> no puedo hacerle override en la clase hija
    // public final void decirNombre() {
    public void decirNombre() {
        System.out.println("Mi nombres es: " + nombre);
    }

    public static void decirApellidos() {
        // System.out.println(nombre); // No puede usarse porque nombre no es estatico
        System.out.println(apellidos); // Si es estatico
    }

    //Encapsulamiento

    public static String getApellidos() {
        return apellidos;
    }

    public static void setApellidos(String apellidos) {
        Padre.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
