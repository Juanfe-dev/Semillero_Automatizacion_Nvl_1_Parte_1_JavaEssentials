package clase_10.abstraccion;

public abstract class FiguraGeometrica {
    String nombre;

    public void decirNombre(){
        System.out.println("La figura es: "+ nombre);
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

