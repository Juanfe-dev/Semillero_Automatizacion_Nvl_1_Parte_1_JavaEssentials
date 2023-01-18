package clase_10.polimorfismo;

public class Main {

    public static void main(String[] args) {
        // Polimorfismo
        Animal animal = new Animal();
        Pollito pollito = new Pollito();
        Perro perro = new Perro(); //no tiene metodos (llamara los de la clase padre)
        Pato pato = new Pato();
        animal.hacerSonido();
        pollito.hacerSonido();
        llamarSonidos(perro); //La del padre (Haciendo un sonido)
        llamarSonidos(pollito); //Pio Pio Pio
        llamarSonidos(animal); //Haciendo un sonido
        llamarSonidos(pato); //Cuak Cuak Cuak
    }

    public static void llamarSonidos(Animal animal){
        animal.hacerSonido();
    }


}
