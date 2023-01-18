package clase_8_POO;

public class Metodos {
    //Convencion del nombre de clase: camelCaseUp
    //Primer palabra en mayuscula
    //Segunda palabra en mayuscula
    public static void main(String[] args) {
        String texto = "Este texto es de una variable.";
        miPrimerMetodo(texto);
        miPrimerMetodo("Hola");
        miPrimerMetodo("como");
        miPrimerMetodo("vas");

    }

    //Convencion del nombre de metodo: camelCaseDown
    //Primer palabra en minuscula
    //Segunda palabra en mayuscula
    public static void miPrimerMetodo(String mensaje){
        System.out.println(mensaje);
    }

    public static String removerComasEspacio(String textoParaRemover){
        String textoLimpio = textoParaRemover.replace(" ", "");
        textoLimpio = textoLimpio.replace(",", "");
        return textoLimpio;
    }
}
