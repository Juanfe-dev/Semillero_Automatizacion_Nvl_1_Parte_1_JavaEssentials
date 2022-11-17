package clase_5;

import java.util.ArrayList;

public class ListaDinamica_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> marcasCarros = new ArrayList<>();

        marcasCarros.add("BMW");
        marcasCarros.add("Mazda");
        marcasCarros.add("Renault");

        //Recorre con un Fori
        for (int i = 0; i < marcasCarros.size(); i++) {
            System.out.println(marcasCarros.get(i));
        }
        //Recorre con un Foreach
        for (String marca : marcasCarros
        ) {
            System.out.println(marca);
        }
        //Metodos de los ArrayList
        marcasCarros.isEmpty(); //Pregunta si esta vacia
        marcasCarros.remove(1); //Borra el elemento en la posicion dada
        marcasCarros.remove("BMW"); //Borra el objeto especificado
        marcasCarros.indexOf("Renault"); //Retorna la posicion del objeto especificado (retorna -1 si no esta)
        marcasCarros.contains("BMW"); //Indica si esta el objeto en la lista
    }
}
