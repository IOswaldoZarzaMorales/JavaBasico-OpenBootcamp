package com.example.estructurasdecontrol.repeticion;

public class For {

    public static void main(String[] args) {

        //Operadores
        //Incremento ++
        //Decremento --
        //Suma +
        //Resta -
        //Multiplicacion *
        //Division /
        //Modulus %
        //Incremento ++


        for (int i = 0; i < 2; i++) {
            //System.out.println("El valor de i es :" + i);
            System.out.println("Hola mundo");
        }
                            //0     --  1       2
        String[] nombres ={"oswaldo", "Zarza", "Ivan", };//Length 3
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros ={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
            System.out.println(suma);
        }


    }
}
