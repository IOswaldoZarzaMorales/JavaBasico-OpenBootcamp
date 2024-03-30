package poo.string;

public class Strings {
    public static void main(String[] args) {
        String cadena = "Mensaje DE texto";

        /* int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();//Convertir a minusculas
        System.out.println("La cadena es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();//Convertir a mayusculas
        System.out.println("La cadena es: " + cadenaMayus); */

        //boolean resultado = cadena.startsWith("Men");

        /*boolean resultado = cadena.endsWith("o");
        if (resultado) {
            System.out.println("Termina por lo que estoy buscando");
        } else {
            System.out.println("No termina por lo que quiero");
        }
        System.out.println(resultado); */

        char letra = cadena.charAt(0);
        System.out.println("Cracter es : " + letra);

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual" + cadena.charAt(i));
        }


    }
}
