package poo.clases;
//Super clase
public  class Vehiculo {

    // 1 Atributos
   protected String modelo;
    protected String fabricante;
   protected double cc;
   protected int year;
   protected boolean sport;
   protected double speed;
   protected Motor motor;



    // 2 Constructores
    public Vehiculo(){

    }

    public Vehiculo(String modelo, String fabricante, double cc, int year, boolean sport, double speed, Motor motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    /* public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
    } */

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    // 3 Métodos (Comportamientos)
    public void acelerar (int quantity){

        this.speed += speed + quantity;
    }

    public class Camion {
    }


    // getter y setter

}
