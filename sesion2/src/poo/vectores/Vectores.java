package poo.vectores;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        /*vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);*/
        //System.out.println("Datos del vector: " + vector);

        /*vector.remove(2);
        System.out.println("Datos del vector: " + vector);*/

        //System.out.println("Vector tamano: " + vector.size() + " y capacidad: " + vector.capacity());

        Vector <Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales : " + resultado);

        /*for(int i: vector){
            System.out.println("Valor actual del vector: " + i);
        }*/

        /*for (int i = 0; i < vector2.size(); i++){
            if ( i % 2 == 0){
                vector2.remove(i);
                continue;
            }
            System.out.println("valor actual del vector : " + vector2.get(i) +  " En posicion: " + i);
        }*/

        /*System.out.println(vector2.get(3));
        vector2.remove(3);
        System.out.println(vector2.get(3));*/

        System.out.println("Capacidad del vector : " + vector2.capacity() + " Tamano " + vector2.size());
        vector2.trimToSize();
        System.out.println("Capacidad del vector : " + vector2.capacity() + " Tamano " + vector2.size());
    }
}
