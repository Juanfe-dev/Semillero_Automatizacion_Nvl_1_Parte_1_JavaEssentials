package clase_10.abstraccion;

public class Main {
    public static void main(String[] args) {
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica() {
        //Yo defini su metodo exactamente en la clase cuadrado
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.decirNombre();
        System.out.println("Area: "+cuadrado.calcularArea());
        System.out.println("Perimetro: "+cuadrado.calcularPerimetro());
        TrianguloEquilatero trianguloEquilatero =
                new TrianguloEquilatero(10, 20);
        cuadrado.decirNombre();
        System.out.println("Area: "+trianguloEquilatero.calcularArea());
        System.out.println("Perimetro: "+trianguloEquilatero.calcularPerimetro());
    }
}
