package com.example.estructurasdecontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Sabado";

        //Ejemplos comparar
        boolean resultadoCompararNumero = 5 == 5;
        boolean resltado = dia.equals("Martes");


        // if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo que empieza la semana");

        } else if (dia.equals("Martes")) {
            System.out.println("Animo que ya es Martes");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Animo que ya es Miercoles");

        } else if (dia.equals("Jueves")) {
            System.out.println("Animo que ya es Jueves");

        } else if (dia.equals("Viernes")) {
            System.out.println("Animo que ya es Viernes");

        } else if (dia.equals("Sabado")) {
            System.out.println("Animo que ya es Sabado");

        } else if (dia.equals("Domingo")) {
            System.out.println("Animo que ya es Domingo");
        } else {
            System.out.println("Ingrese un dato valido");
        }
    }
}

