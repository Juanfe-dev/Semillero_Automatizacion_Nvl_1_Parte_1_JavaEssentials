package clase_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Carro 1
        //Tipo de dato no primitivo de tipo Carro
        Carro bmw = new Carro("bmw"); //instanciar un objeto
        bmw.color = "Amarillo";
        System.out.println(bmw.color);

        //Carro 2
        Carro mazda = new Carro("Mazda");
        mazda.color = "Rojo";
        mazda.marca = "Mazda";
        System.out.println(mazda.marca); // Mazda
        System.out.println(bmw.marca); // null

        //Carro 3
        Carro dodge = new Carro("Dodge", "verde", 2000);
        System.out.println(dodge.marca);
        System.out.println(dodge.color);
        System.out.println(dodge.tamañoMotor);

        //Uso metodos de la clase Carro
        bmw.describirCarro();
        mazda.describirCarro();
        dodge.describirCarro();

        //Herencia

        Padre padre = new Padre("Pepe");
        padre.nombre = "Pepe";
        padre.edad = 36;

        Hijo hijo = new Hijo("Juan", Arrays.asList("Crash", "Mario"));
        // hijo.nombre = "Juan"; //Atributo desde clase padre
        hijo.edad = 12; //Atributo desde clase padre
        // hijo.videoJuegos.add("Crash");
        padre.decirNombre();
        hijo.decirNombre();
        // padre.decirVideoJuegos(); No puede ser usado porque es del hijo
        hijo.decirVideoJuegos();

        Hijo pedro = new Hijo("pedro", Arrays.asList("Zelda", "Mortal Kombat"));
        // pedro.nombre = "Pedro";
        pedro.edad = 19;
        // pedro.videoJuegos.add("Zelda");
        pedro.decirNombre();
        pedro.decirVideoJuegos();

        //Uso de superconstructor
    }
}
