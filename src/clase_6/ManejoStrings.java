package clase_6;

public class ManejoStrings {

    public static void main(String[] args){

        String texto = " 1. Hola, cómo estas? ";
        //.length - Tamaño del string
        System.out.println("1. Length: "+texto.length());
        //.toLowerCase
        System.out.println("2. Lowecase: "+ texto.toLowerCase());
        //.toUpperCase
        System.out.println("3. Uppercase: "+texto.toUpperCase());
        //.Replace (Requiere otra variable para almacenarlo)
        String textoReplace = "4. Replace: "+texto.replace("Hola", "Texto reemplzadado");
        System.out.println(textoReplace);
        //.Replace First (Reemplaza la primer coincidencia)
        String textoReplaceFirst = "5. ReplaceFirst: "+ texto.replaceFirst("Hola", "First");
        System.out.println(textoReplaceFirst);
        //.Split
        String[] textoSplit = texto.split(" ");
        System.out.println("6. Split");
        for (int i = 0; i < textoSplit.length; i++) {
            System.out.println(textoSplit[i]);
        }
        //.Trim (remueve los espacios al comienzo y final)
        System.out.println("7. Trim: "+texto.trim());
        System.out.println(" . Trim y length: "+texto.trim().length());
        //.Contains (Pregunta si un caracter/cadena existe dentro de un string)
        System.out.println("8. Contains Hola: ");
        if(texto.contains("Hola")){
            System.out.println(" . Si contiene la palabra Hola");
        } else {
            System.out.println(" . No contiene la palabra Hola");
        }
        //.StartsWith (El string comienza por una palabra especifica)
        System.out.println("9. StartsWith  1.: "+texto.startsWith(" 1."));
        System.out.println(" . StartsWith Ho: "+texto.startsWith("Ho"));
        System.out.println(" . StartsWith  1. Hola: "+texto.startsWith(" 1. Hola"));
        System.out.println(" . StartsWith cómo estas: "+texto.startsWith("cómo estas"));
        //.EndsWith (El String finaliza con una palabra especifica)
        System.out.println("10. EndsWith cómo estas? : "+texto.startsWith("cómo estas? "));
        //.isEmpty (Esta vacio?)
        String textoVacio = "";
        System.out.println("11. texto isEmpty: "+ texto.isEmpty());
        System.out.println(" . textoVacio isEmpty: "+ textoVacio.isEmpty());
        //.ChartAt
        System.out.println("12. CharAt 4: "+ texto.charAt(4));
        //.IndexOf (En que posicion esta el caracter o string)
        System.out.println("13. IndexOf ó: "+texto.indexOf("ó"));
        System.out.println(" . IndexOf x: "+texto.indexOf("x")+ " <- No lo encuentra (-1)");
        //.Concat (agregar otro texto)
        System.out.println("14. Concat: "+ texto.concat("...Otro Texto"));
        //.SubString (Retorna el substring desde la posición dada + 1)
        System.out.println("15. SubString1: "+texto.substring(4));
        System.out.println(" . SubString2: "+texto.substring(4, 8));
        //.Matches
        System.out.println("16. Matches: este sema se verá mas a delante");
        //.ReplaceFirst
        System.out.println("17. ReplaceFirst Hola:"+texto.replaceFirst("Hola", "Buenos días"));
    }
}
