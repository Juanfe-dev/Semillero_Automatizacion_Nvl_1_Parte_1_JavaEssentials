package clase_12.ejercicioParqueadero.solucionProfesor;

import java.time.Instant;
import java.util.Date;

public abstract class Vehiculo {

    private String color, marca, modelo;
    private final String placa;
    private int precioHora, espacioOcupado;
    private Date horaIngreso;

    public Vehiculo(String color, String marca, String modelo, String placa, int espacioOcupado) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.espacioOcupado = espacioOcupado;
        this.horaIngreso = Date.from(Instant.now());
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getPrecioHora() {
        return precioHora;
    }
    //metodo abstracto
    public abstract int setPrecioHora();

    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    public void setEspacioOcupado(int espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
}
