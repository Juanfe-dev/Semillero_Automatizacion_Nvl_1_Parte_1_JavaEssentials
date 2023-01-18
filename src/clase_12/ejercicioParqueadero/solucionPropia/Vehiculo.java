package clase_12.ejercicioParqueadero.solucionPropia;

import java.util.Date;

public class Vehiculo {

    private final String placa;
    private String color;
    private String marca;
    private double valorHora;
    private final int espacioOcupado;
    private String horaIngreso;


    public Vehiculo(String placa, String color, String marca, double valorHora, int espacioOcupado, String horaIngreso) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.valorHora = valorHora;
        this.espacioOcupado = espacioOcupado;
        this.horaIngreso = horaIngreso;
    }

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    //DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    // Date date = new Date();
    //  System.out.println("Hora actual: " + dateFormat.format(date));

}
