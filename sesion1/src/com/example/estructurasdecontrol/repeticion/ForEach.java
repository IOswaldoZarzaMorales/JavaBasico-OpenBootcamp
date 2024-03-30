package com.example.estructurasdecontrol.repeticion;

public class ForEach {

    public static void main(String[] args) {

        String[] nombres ={"oswaldo", "Zarza", "Ivan", };
        for(String nombre: nombres ){
            System.out.println(nombre);
        }

        int[] numeros ={1, 2, 3, 4 };
        int suma = 0;
        for(int numero: numeros ){
        //suma = suma + numero;
        suma += numero;
            System.out.println(suma);
        }


    }
}
