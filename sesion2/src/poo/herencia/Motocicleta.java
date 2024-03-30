package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;
    public Motocicleta(){};

    public Motocicleta(String modelo, String fabricante, double cc, int year, boolean sport, double speed, Motor motor, boolean baul) {
        super(modelo, fabricante, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
