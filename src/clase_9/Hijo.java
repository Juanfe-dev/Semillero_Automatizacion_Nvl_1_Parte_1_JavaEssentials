package clase_9;

import java.util.ArrayList;
import java.util.List;

public class Hijo extends Padre {

    List<String> videoJuegos;

    public Hijo (String nombre, List<String> videoJuegos){
        super(nombre);
        this.videoJuegos = videoJuegos;
    }
    //Si mi clase padre tiene un constructor ya no pueden existir constructores por defecto
    public Hijo(String nombre){
        super(nombre);
    }

    public void decirVideoJuegos(){
        for (String videoJuego : videoJuegos){
          System.out.println(videoJuego);
        }
    }






}
