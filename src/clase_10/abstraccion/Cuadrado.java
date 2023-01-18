package clase_10.abstraccion;

public class Cuadrado extends FiguraGeometrica{
    private int lado;
    public Cuadrado(int lado){
        super.nombre = "Cuadrado";
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
}
