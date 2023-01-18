package clase_10.abstraccion;

public class TrianguloEquilatero extends FiguraGeometrica{

    int base;
    int altura;

    public TrianguloEquilatero(int base, int altura){
        nombre = "Triangulo equilater";
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return base*3;
    }
}
