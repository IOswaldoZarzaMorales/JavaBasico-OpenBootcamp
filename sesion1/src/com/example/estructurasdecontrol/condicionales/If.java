package com.example.estructurasdecontrol.condicionales;

public class If {

    public static void main(String[] args) {

        int edad = 19;
        boolean esMayor = edad >= 18; //false

        if (edad >= 18){
            System.out.println("Es menor de edad");
        }

        if (esMayor){
            System.out.println("Es menor de edad");
        }

        System.out.println("Es mayor de edad");


    }
}
