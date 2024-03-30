package poo.entradaYsalida;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        /*try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos numeros");
            String a = scanner.next();
            String b = scanner.next();
            System.out.println("Enteros son: "+ a + " " + b);

            //InputStream fichero = new FileInputStream("/etc/passwd");
            //BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //System.out.println("Mete dos numeros");
        Scanner scanner = new Scanner(System.in);
        boolean ok = false;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa dos numeros");
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Numero invalidos");
            }
        } while (!ok);

        //PrintStream
        //System.out.println("Cosa");
        //PrintStream info = new PrintStream("copia.txt");
        //info.println("Cosa");

        try {
            InputStream in = new InputStream("/etc/passwd");
            byte [] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();
        } catch (Exception e){
            System.out.println("Excepcion" + e.getMessage());
        }*/








    }
}




        /*try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos numeros");
            String a = scanner.next();
            String b = scanner.next();
            System.out.println("Enteros son: "+ a + " " + b);

            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            /*try {
                byte datos[] = new byte[5];
                int dato = fichero.read();
                while (dato!= -1) {
                    System.out.print(datos.toString());
                    dato = fichero.read(datos);
                }

            try {
                int dato = ficheroBuffer.read();
                while (dato!= -1) {
                    System.out.print((char) dato);
                    dato = ficheroBuffer.read();
                    }


                /*for (int dato : datos) {
                    System.out.println((char)dato);
                }

            } catch (IOException e){
                System.out.println("No puedo leer el fichero" + e.getMessage());
            }


        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero" + e.getMessage());
        }

    }*/

