package clase_11.modificadores.sin_acceso;

public class Main {

    public static void main(String[] args) {
        Hijo hijo = new Hijo("Albeiro");

        //Uso del static en atributo
        Padre padre = new Padre("Sin nombre asignado");
        //Mediante el objeto puedo acceder al nombre
        //Creamos una instancia con el objeto para acceder a su propio atributo nombre
        padre.setNombre("Juan Felipe");
        System.out.println((padre.getNombre()));
        //Mediante la clase directamente puedo acceder al atributo static
        //No se crean instancias nuevas sino que se accede directamente
        Padre.apellidos = "Gomez Arboleda";
        System.out.println(Padre.apellidos);

    }
}
