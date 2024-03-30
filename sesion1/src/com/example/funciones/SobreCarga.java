package com.example.funciones;

public class SobreCarga {
    /**
     * Soobre carga permite duplicar un método siempre y cuando tengan diferente numero/ tipo de parametros.
     * @param args
     */
    public static void main(String[] args) {
        //() -> System.out.println()
    }

    static double suma(double numero1, double numero2){
        return numero1 + numero2;
    }
    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
}
