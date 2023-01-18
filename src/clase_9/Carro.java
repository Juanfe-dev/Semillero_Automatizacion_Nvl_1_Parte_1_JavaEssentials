package clase_9;

public class Carro {

    //Miembros de clase (por fuera de los metodos y tienen alcance en toda la clase)
    String marca;
    String color;
    int tamañoMotor;

    public void describirCarro(){
        System.out.println("La marca es: "+ marca);
        System.out.println("El color es: "+ color);
        System.out.println("El tamaño del motor es: "+ tamañoMotor);
    }
    //Metodo constructor
    //Especifican la obligatoriedad de las variables para cierto objeto
    //Permiten inicializar datos por medio del this
    //Comparte el nombre de la clase
    //No tiene retorno
    public Carro(){
        //CONSTRUCTOR POR DEFECTO
        marca = "Generica";
        color = "Gris";
        tamañoMotor = 1200;
    }
    public Carro(String marca){
        this.marca = marca;
    }
    public Carro(String marca, String color){
        this.marca = marca;
        this.color = color;
    }
    public Carro(String marca, String color, int tamañoMotor){
        this.marca = marca;
        this.color = color;
        this.tamañoMotor = tamañoMotor;
    }
    //Sobrecarga
    public void asignarTamaño(int tamaño){
        tamañoMotor = tamaño;
    }
    public void asignarTamaño(double tamaño){
        tamañoMotor = (int) tamaño;
    }
}
