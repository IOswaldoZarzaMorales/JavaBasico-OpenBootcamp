package poo.errores;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Errores {

    public static void main(String[] args) {
        //System.out.println(5 / 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa dos numeros");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try {
            int resultado = numeroA / numeroB;
            System.out.println("Resultado" + resultado);
        } catch (Exception e) {
            System.out.println("Error" + e.getClass());
        }



        /*int temperature = 25;
        if (temperature < 25) {
            System.out.println("Hace frio");
        }*/
    }

}
