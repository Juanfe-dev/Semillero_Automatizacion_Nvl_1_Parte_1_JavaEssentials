package clase_11.modificadores.sin_acceso;

public class Hijo extends Padre {


    public Hijo(String nombre) {
        super(nombre);
    }

    //Metodo de tipo final -> no puedo hacerle override
    @Override
    public void decirNombre() {
//        nombre = "Pedro"; //Es final en la clase padre, no puede ser modificado
        System.out.println("Diciendo nombre desde la clase hija: " + nombreHerencia);
    }

}
