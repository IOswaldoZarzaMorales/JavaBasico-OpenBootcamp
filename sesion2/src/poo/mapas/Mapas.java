package poo.mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);
       // map.put("clave3", 20);
        map.put("clave4", 40);

        //map.replace("clave1", 200);
        //map.remove("clave2");

        //System.out.println(map.get("clave1"));
        //System.out.println(map);

        for (Map.Entry elemento : map.entrySet()) {
            System.out.println("Elemnto es " + elemento.getKey());
            System.out.println("Elemento valor  es " + elemento.getValue());


        }


    }
}
