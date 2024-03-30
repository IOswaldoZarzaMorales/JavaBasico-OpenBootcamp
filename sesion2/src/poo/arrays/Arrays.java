package poo.arrays;

public class Arrays {

    public static void main(String[] args) {

        int array1[] = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        int array2[] = {1, 2, 3, 4, 5, 6, 7, 8};

        String array3[] = {
                "Oswaldo",
                "Zarza",
                "Morales"
        };

        //System.out.println("Longitud de la array: " + array3.length);

        /*for (int i : array1) {
            System.out.println(i);
        }

        for (int i : array2) {
            System.out.println(i);
        }

        for (String i : array3) {
            System.out.println(i);
        }*/

        //For each
        /*for (String nombre : array3) {
            System.out.println("Nombre actual: " + nombre);
        }
        //For

        //String ultimoNombre = "";
        for (int i = 0; i < array3.length; i++) {
            System.out.println("Nombre actual: "  + array3[i] + "En posicion: " + i);
           // ultimoNombre = array3[i];
        }*/

        //System.out.println(ultimoNombre);

        /*int contador = 0;
        while (contador < array3.length){
            System.out.println("Nombre actual: "  + array3[contador] + "En posicion: " + contador);
            contador++;
        }*/

        /*int arrayBidi [][] = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 5;
        arrayBidi[1][1] = 6;
        arrayBidi[1][2] = 7;
        arrayBidi[1][3] = 8;*/

        //array de dos filar  x 4 columnas
        int arrayBidi [][] = {

                {1,2,3,4,5},
                {10,20,30,40},

        };

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Estoy en i = " + 1 + " Estoy en j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
            //System.out.println("Valor de i  " + i);
        }

        String nombres[] = {"Pepe", "Juan"};
        nombres[0] = "Victor";
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}
