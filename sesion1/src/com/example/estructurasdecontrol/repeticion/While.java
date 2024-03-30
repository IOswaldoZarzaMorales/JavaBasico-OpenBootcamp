package com.example.estructurasdecontrol.repeticion;

public class While {

    public static void main(String[] args) {

        int contador = 0;

        while (contador < 10) {
            String nombre ="Oswaldo";
            contador++;
            if (contador == 5){
                continue;
                //Break
            }

            System.out.println("Valor de contador: " + contador);
        }
        //System.out.println(nombre);//Las

        int contador2 = 10;

        while (contador2 > 0){
            System.out.println(contador2);
            contador2--;
        }
    }
}
