package com.example.estructurasdecontrol.condicionales;

public class Switch {

    public static void main(String[] args) {

        String dia = "Martes";

        switch (dia) {
            case "Lunes":
                System.out.println("Animo que empieza la semana");
                break;
            case "Martes":
                System.out.println("Animo que ya es Martes");
                break;
            case "Miercoles":
                System.out.println("Animo que ya es Miercoles");
                break;
            case "Jueves":
                System.out.println("Animo que ya es Jueves");
                break;
            case "Viernes":
                System.out.println("Animo que ya es Viernes");
                break;
            case "Sabado":
                System.out.println("Animo que ya es Sabado");
                break;
            case "Domingo":
                System.out.println("Animo que ya es Domingo");
                break;
            default:
                System.out.println("Ingrese un dato valido");
        }


    }
}
