package com.example.funciones;

public class Funcioness {

    public static void main(String[] args) {



        //opcion 1: funcion sin parametros y sin tipo de retorno
        //showMenu();
        //showMenu();

        //opcion 2:funcion sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);

        double price = getPrice();
        System.out.println(price);
        //Opcion 3: funcion con parametros y sin tipo de retorno

        imprimirSaludoBuenosDias("OpenBootcamp");

        //opcion 4: funcion con parametros y con tipo de retorno
        String nombre = "Oswaldo";
        String apellido = "Zarza";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);
        int resultado =suma(50, 200);
    }

    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenos tardes " + nombre + " "+ apellido;
    }
    static void imprimirSaludoBuenosDias(String name) {
        System.out.println("Buenas tardes " + name);
    }

    static double getPrice() {
        return 100.99;
    }


    /**
     * void indica que no devuelve nada
     */
    static void showMenu(){
        System.out.println("Bienvenidos a E-comerce");
        System.out.println("1 - Zapatillas");
        System.out.println("2 - Comprar Zapatilla");
        System.out.println("3 - Salir");

    }

    static String getMenu(){

        return "Bienvenidos a E-comerce \n 1 - Zapatillas";

    }
}
