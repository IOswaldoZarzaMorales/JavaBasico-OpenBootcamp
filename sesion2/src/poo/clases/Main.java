package poo.clases;
import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {
    //1 Clases y objetos
    //Clase identificador = new Clase();

    //crear un objeto utilizando el constructor vacío
    Vehiculo toyotaPrius = new Vehiculo();

    // crear un objeto utilizando el constructor con parametros
    Motor motorCTI=  new Motor("GTI", 190, 200, 100);
    Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 200, motorCTI);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);
    //2 Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "italika";

        System.out.println("Fin de programa");

        //3 Polimorfismo

        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo. new Camion();
        vehiculo.acelerar(50);

        // 4 clases abstractas no se pueden instanciar,  solo se intancian las clases hijas
    }
}
